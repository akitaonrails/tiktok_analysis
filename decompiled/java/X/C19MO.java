package X;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19MO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MO {
    public final ConstraintLayout LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public final SparseArray<C19ML> LIZLLL = new SparseArray<>();
    public final SparseArray<C19MB> LJ = new SparseArray<>();

    public final void LIZ(Context context, XmlPullParser xmlPullParser) {
        int iN3;
        C19MB c19mb = new C19MB();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (FollowStatusChangeMethod.PARAM_UID.equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                if (attributeValue.contains("/")) {
                    iN3 = C786410Ut5.n3(context.getResources(), attributeValue.substring(attributeValue.indexOf(47) + 1), FollowStatusChangeMethod.PARAM_UID, context.getPackageName());
                    if (iN3 == -1) {
                    }
                    c19mb.LJIJJLI(context, xmlPullParser);
                    this.LJ.put(iN3, c19mb);
                    return;
                }
                iN3 = -1;
                if (attributeValue.length() > 1) {
                    iN3 = CastIntegerProtector.parseInt(attributeValue.substring(1));
                }
                c19mb.LJIJJLI(context, xmlPullParser);
                this.LJ.put(iN3, c19mb);
                return;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C19MO(Context context, ConstraintLayout constraintLayout, int i) {
        int eventType;
        C19ML c19ml;
        this.LIZ = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            c19ml = null;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return;
        } catch (XmlPullParserException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return;
        }
        for (eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType != 0) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                LIZ(context, xml);
                            } else {
                                continue;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c19ml = new C19ML(context, xml);
                                this.LIZLLL.put(c19ml.LIZ, c19ml);
                            } else {
                                continue;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                continue;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                continue;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C19MH c19mh = new C19MH(context, xml);
                                if (c19ml != null) {
                                    c19ml.LIZIZ.add(c19mh);
                                }
                            } else {
                                continue;
                            }
                            break;
                        default:
                            continue;
                    }
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
                continue;
            } else {
                xml.getName();
            }
        }
    }

    public final void LIZIZ(float f, float f2, int i) {
        C19MB c19mb;
        C19ML c19mlValueAt;
        int iLIZ;
        int i2 = this.LIZIZ;
        if (i2 == i) {
            if (i == -1) {
                c19mlValueAt = this.LIZLLL.valueAt(0);
            } else {
                c19mlValueAt = this.LIZLLL.get(i2);
            }
            int i3 = this.LIZJ;
            if ((i3 == -1 || !((C19MH) ListProtector.get(c19mlValueAt.LIZIZ, i3)).LIZ(f, f2)) && this.LIZJ != (iLIZ = c19mlValueAt.LIZ(f, f2)) && iLIZ != -1) {
                C19MB c19mb2 = ((C19MH) ListProtector.get(c19mlValueAt.LIZIZ, iLIZ)).LJFF;
                if (iLIZ != -1) {
                }
                if (c19mb2 != null) {
                    this.LIZJ = iLIZ;
                    c19mb2.LIZIZ(this.LIZ);
                    return;
                }
                return;
            }
            return;
        }
        this.LIZIZ = i;
        C19ML c19ml = this.LIZLLL.get(i);
        int iLIZ2 = c19ml.LIZ(f, f2);
        if (iLIZ2 == -1) {
            c19mb = c19ml.LIZLLL;
        } else {
            c19mb = ((C19MH) ListProtector.get(c19ml.LIZIZ, iLIZ2)).LJFF;
            if (iLIZ2 != -1) {
            }
        }
        if (c19mb == null) {
            return;
        }
        this.LIZJ = iLIZ2;
        c19mb.LIZIZ(this.LIZ);
    }
}
