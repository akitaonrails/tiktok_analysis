package X;

import android.content.Context;
import android.util.Xml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19MU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MU {
    public static final HashMap<String, Constructor<? extends AbstractC21525919Mb>> LIZIZ;
    public final HashMap<Integer, ArrayList<AbstractC21525919Mb>> LIZ = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC21525919Mb>> map = new HashMap<>();
        LIZIZ = map;
        try {
            map.put("KeyAttribute", C21526719Mj.class.getConstructor(new Class[0]));
            map.put("KeyPosition", C19MZ.class.getConstructor(new Class[0]));
            map.put("KeyCycle", C21528119Mx.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", C21526819Mk.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", C21528219My.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ(C21528019Mw c21528019Mw) {
        ArrayList<AbstractC21525919Mb> arrayList = this.LIZ.get(Integer.valueOf(c21528019Mw.LIZIZ));
        if (arrayList != null) {
            c21528019Mw.LJIJJ.addAll(arrayList);
        }
        ArrayList<AbstractC21525919Mb> arrayList2 = this.LIZ.get(-1);
        if (arrayList2 != null) {
            for (AbstractC21525919Mb abstractC21525919Mb : arrayList2) {
                String str = ((C19ME) c21528019Mw.LIZ.getLayoutParams()).constraintTag;
                String str2 = abstractC21525919Mb.LIZJ;
                if (str2 != null && str != null && str.matches(str2)) {
                    c21528019Mw.LJIJJ.add(abstractC21525919Mb);
                }
            }
        }
    }

    public final void LIZIZ(AbstractC21525919Mb abstractC21525919Mb) {
        if (!this.LIZ.containsKey(Integer.valueOf(abstractC21525919Mb.LIZIZ))) {
            this.LIZ.put(Integer.valueOf(abstractC21525919Mb.LIZIZ), new ArrayList<>());
        }
        this.LIZ.get(Integer.valueOf(abstractC21525919Mb.LIZIZ)).add(abstractC21525919Mb);
    }

    public C19MU(Context context, XmlPullParser xmlPullParser) {
        AbstractC21525919Mb abstractC21525919MbNewInstance;
        HashMap<String, C21526019Mc> map;
        try {
            int eventType = xmlPullParser.getEventType();
            AbstractC21525919Mb abstractC21525919Mb = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    HashMap<String, Constructor<? extends AbstractC21525919Mb>> map2 = LIZIZ;
                    if (map2.containsKey(name)) {
                        try {
                            abstractC21525919MbNewInstance = map2.get(name).newInstance(new Object[0]);
                        } catch (Exception e) {
                            e = e;
                            abstractC21525919MbNewInstance = abstractC21525919Mb;
                        }
                        try {
                            abstractC21525919MbNewInstance.LIZJ(context, Xml.asAttributeSet(xmlPullParser));
                            LIZIZ(abstractC21525919MbNewInstance);
                        } catch (Exception e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                        abstractC21525919Mb = abstractC21525919MbNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC21525919Mb != null && (map = abstractC21525919Mb.LIZLLL) != null) {
                        C21526019Mc.LJ(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (XmlPullParserException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
