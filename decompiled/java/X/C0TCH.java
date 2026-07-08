package X;

import com.bytedance.forest.Forest;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0TCH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCH {
    public static Forest LIZIZ;
    public static final C0TCH LIZ = new C0TCH();
    public static final C2272621DxM LIZJ = new C0TCI() { // from class: X.1DxM
        @Override // X.C0TCI
        public final void onStart() {
        }

        @Override // X.C0TCI
        public final void LIZ(final C1529660puO c1529660puO) {
            C0NB9.LIZ(new C0NBA() { // from class: X.1DxL
                @Override // X.C0NBA
                public final void LIZ(C0NBB c0nbb) throws JSONException {
                    C1529660puO c1529660puO2 = c1529660puO;
                    c0nbb.LIZ("channel", c1529660puO2.LIZ);
                    c0nbb.LIZ("bundle", c1529660puO2.LIZIZ);
                    c0nbb.LIZ("result", 1);
                }
            }, "feed_forest_lighten_result");
        }

        @Override // X.C0TCI
        public final void LIZIZ(final C1529660puO c1529660puO, final EnumC742810TBv enumC742810TBv, final String str) {
            C0NB9.LIZ(new C0NBA() { // from class: X.1DxK
                @Override // X.C0NBA
                public final void LIZ(C0NBB c0nbb) throws JSONException {
                    C1529660puO c1529660puO2 = c1529660puO;
                    EnumC742810TBv enumC742810TBv2 = enumC742810TBv;
                    String str2 = str;
                    c0nbb.LIZ("channel", c1529660puO2.LIZ);
                    c0nbb.LIZ("bundle", c1529660puO2.LIZIZ);
                    c0nbb.LIZ("result", 0);
                    c0nbb.LIZ("error_code", enumC742810TBv2.name());
                    c0nbb.LIZ("error_message", str2);
                }
            }, "feed_forest_lighten_result");
        }
    };

    public static C0VSJ LIZIZ(C1533790q13 c1533790q13) {
        String strLIZLLL;
        if (!c1533790q13.LIZIZ || (strLIZLLL = c1533790q13.LIZLLL()) == null || strLIZLLL.length() == 0) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZLLL);
        if (!c0vsj.exists()) {
            return null;
        }
        return c0vsj;
    }

    public static void LIZ(C0TCH c0tch, C1529660puO c1529660puO) {
        c0tch.getClass();
        Forest forestLIZ = LIZIZ;
        if (forestLIZ == null) {
            forestLIZ = C0T1N.LIZ();
            LIZIZ = forestLIZ;
        }
        forestLIZ.fetchResourceAsync(c1529660puO.LIZJ, c1529660puO.LIZ(), new AwS591S0100000_12(c1529660puO, (C1529660puO) null, (Function1<? super C189200o6<? extends File>, Unit>) 652));
    }
}
