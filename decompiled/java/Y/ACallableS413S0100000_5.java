package Y;

import X.C0CHQ;
import X.C0FFP;
import X.C0VSJ;
import X.C1C7U;
import X.C20012413Ry;
import X.C354070DuP;
import X.C354080DuQ;
import X.C386320FCs;
import X.InterfaceC1452170ntP;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class ACallableS413S0100000_5 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS413S0100000_5 aCallableS413S0100000_5) {
        C1C7U.LIZ("VOLogicComponent@4430.prepareRecordFileEvn$2");
        ((Runnable) aCallableS413S0100000_5.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VOLogicComponent@4430.prepareRecordFileEvn$2");
        return unit;
    }

    public static final Object call$1(ACallableS413S0100000_5 aCallableS413S0100000_5) {
        File[] fileArrListFiles;
        long jLongValue;
        C1C7U.LIZ("ExternalSaveFileHelper@b1fd.removeFileWhenExit$1");
        C0VSJ c0vsj = new C0VSJ(C354080DuQ.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), (CreativeInfo) aCallableS413S0100000_5.l0, null, 6));
        if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = C354070DuP.LIZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jCurrentTimeMillis > jLongValue) {
                C354070DuP.LIZ = null;
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExternalSaveFileHelper@b1fd.removeFileWhenExit$1");
        return unit;
    }

    public static final Object call$2(ACallableS413S0100000_5 aCallableS413S0100000_5) {
        C1C7U.LIZ("StickerCompilerManager@f6a9.getCompileStickerTask$1");
        Bitmap bitmapLIZJ = ((C0FFP) aCallableS413S0100000_5.l0).LIZJ();
        C1C7U.LIZIZ("StickerCompilerManager@f6a9.getCompileStickerTask$1");
        return bitmapLIZJ;
    }

    public static final Object call$3(ACallableS413S0100000_5 aCallableS413S0100000_5) {
        Integer numValueOf;
        C1C7U.LIZ("ChooseCoverHelper@ec4.tryAutoStop$1");
        InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) ((Function0) aCallableS413S0100000_5.l0).invoke();
        if (interfaceC1452170ntP != null) {
            numValueOf = Integer.valueOf(interfaceC1452170ntP.pause());
        } else {
            numValueOf = null;
        }
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.tryAutoStop$1");
        return numValueOf;
    }

    public static final Object call$4(ACallableS413S0100000_5 aCallableS413S0100000_5) {
        C1C7U.LIZ("EditorProFileCenter@af21.clearCache$1");
        Iterator<String> it2 = ((C386320FCs) aCallableS413S0100000_5.l0).LIZ.iterator();
        while (it2.hasNext()) {
            C20012413Ry.LJFF(it2.next());
        }
        ((C386320FCs) aCallableS413S0100000_5.l0).LIZ.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProFileCenter@af21.clearCache$1");
        return unit;
    }

    public ACallableS413S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
