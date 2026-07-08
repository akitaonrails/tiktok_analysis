package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19MN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MN {
    public int LIZ;
    public final SparseArray<C19MM> LIZIZ = new SparseArray<>();

    public final int LIZ(int i) {
        int iLIZ;
        float f = -1;
        if (-1 == i) {
            C19MM c19mmValueAt = this.LIZIZ.valueAt(0);
            if (c19mmValueAt == null || -1 == (iLIZ = c19mmValueAt.LIZ(f, f))) {
                return -1;
            }
            if (iLIZ == -1) {
                return c19mmValueAt.LIZJ;
            }
            return ((C19MG) ListProtector.get(c19mmValueAt.LIZIZ, iLIZ)).LJ;
        }
        C19MM c19mm = this.LIZIZ.get(i);
        if (c19mm == null) {
            return -1;
        }
        int iLIZ2 = c19mm.LIZ(f, f);
        if (iLIZ2 == -1) {
            return c19mm.LIZJ;
        }
        return ((C19MG) ListProtector.get(c19mm.LIZIZ, iLIZ2)).LJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C19MN(Context context, XmlPullParser xmlPullParser) {
        this.LIZ = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.StateSet_defaultState) {
                this.LIZ = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZ);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            C19MM c19mm = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        if (eventType != 3) {
                            continue;
                        } else if ("StateSet".equals(xmlPullParser.getName())) {
                            return;
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case 80204913:
                                if (name.equals("State")) {
                                    c19mm = new C19MM(context, xmlPullParser);
                                    this.LIZIZ.put(c19mm.LIZ, c19mm);
                                }
                                break;
                            case 1301459538:
                                if (name.equals("LayoutDescription")) {
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    C19MG c19mg = new C19MG(context, xmlPullParser);
                                    if (c19mm != null) {
                                        c19mm.LIZIZ.add(c19mg);
                                    }
                                }
                                break;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (XmlPullParserException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
