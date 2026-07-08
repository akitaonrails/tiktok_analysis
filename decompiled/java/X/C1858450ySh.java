package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoMaskAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.mix.TakoAnswerMixAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem.TakoNewMarkdownAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0ySh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858450ySh {
    public static final C1858450ySh LIZ = new C1858450ySh();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicReference<TakoAnswerMixAssem> LIZLLL = new AtomicReference<>(null);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final AtomicReference<TakoReferenceAssem> LJFF = new AtomicReference<>(null);
    public static final AtomicReference<TakoNewMarkdownAssem> LJI = new AtomicReference<>(null);
    public static final AtomicReference<TakoMaskAssem> LJII = new AtomicReference<>(null);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ() {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1858450ySh.LIZ():java.util.List");
    }

    public static List LIZLLL() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if ((C0B1N.LIZ() & 2) == 2) {
            arrayList.add(Integer.valueOf(R.layout.fkz));
        }
        if ((C0B1N.LIZ() & 4) == 4) {
            int i2 = 0;
            do {
                arrayList.add(Integer.valueOf(R.layout.fm9));
                i2++;
            } while (i2 < 2);
            do {
                arrayList.add(Integer.valueOf(R.layout.fm8));
                i++;
            } while (i < 4);
        }
        return arrayList;
    }

    public static List LIZJ(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        if (length == 0) {
            return C13BV.INSTANCE;
        }
        if (((Boolean) C1859107Px.LIZ.getValue()).booleanValue() && TakoEnterMethodListExperiment.LIZ(false)) {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            c13dvLIZIZ.add(Integer.valueOf(R.layout.fn6));
            do {
                C1858430ySf c1858430ySf = C1858440ySg.LIZ;
                if (c1858430ySf == null) {
                    c1858430ySf = C1858430ySf.LJIIIZ;
                }
                if (c1858430ySf.LIZLLL == EnumC2012407uU.OLD_STYLE) {
                    if (c1858430ySf.LIZ) {
                        i = R.layout.fl4;
                    } else {
                        i = R.layout.fl3;
                    }
                } else {
                    i = R.layout.fl2;
                }
                c13dvLIZIZ.add(Integer.valueOf(i));
                i2++;
            } while (i2 < 4);
            return C1697820uHc.LIZ(c13dvLIZIZ);
        }
        C13DV c13dvLIZIZ2 = C1697820uHc.LIZIZ();
        do {
            c13dvLIZIZ2.add(Integer.valueOf(R.layout.flv));
            i2++;
        } while (i2 < 4);
        return C1697820uHc.LIZ(c13dvLIZIZ2);
    }

    public static List LIZIZ(String str, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            i = R.layout.fo_;
        } else {
            i = R.layout.fo9;
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(R.layout.fke));
        LIZ.getClass();
        arrayList.addAll(LIZ());
        C07QD.LIZ.getClass();
        if (C07QD.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            arrayList.add(Integer.valueOf(R.layout.fm0));
            if (z3) {
                arrayList.add(Integer.valueOf(R.layout.fm1));
            }
        }
        if (z2) {
            arrayList.addAll(LIZLLL());
            if (z) {
                arrayList.add(Integer.valueOf(R.layout.fr1));
            }
            arrayList.addAll(LIZJ(str));
            arrayList.add(Integer.valueOf(R.layout.fmk));
            arrayList.add(Integer.valueOf(R.layout.fko));
            arrayList.add(Integer.valueOf(R.layout.fpv));
            if (C2273971DzX.LIZ()) {
                arrayList.add(Integer.valueOf(R.layout.flx));
            }
            if (!C298800BnS.LIZ() || !TakoEnterMethodListExperiment.LIZ(false)) {
                C1854970yN5.LIZ.getClass();
                if (C1854970yN5.LIZ()) {
                    i2 = R.layout.fkc;
                } else {
                    i2 = R.layout.fka;
                }
                arrayList.remove(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }
}
