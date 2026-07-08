package Y;

import X.C1448520nnW;
import X.C1624410sND;
import X.C1638280sja;
import X.C1644050sst;
import X.C1656070tCH;
import X.C1656120tCM;
import X.C19GS;
import X.C1C7U;
import X.C21366318jV;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C786410Ut5;
import X.InterfaceC1463990oCT;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS19S1300000_25 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS19S1300000_25 aRunnableS19S1300000_25) {
        C1656070tCH c1656070tCH = (C1656070tCH) aRunnableS19S1300000_25.l1;
        String str = aRunnableS19S1300000_25.s0;
        C1656120tCM c1656120tCM = (C1656120tCM) aRunnableS19S1300000_25.l2;
        Integer num = (Integer) aRunnableS19S1300000_25.l3;
        c1656070tCH.getClass();
        C1C7U.LIZ("StartRecordingCommandEventHandlerFactory@d1fb.lambda$actualStartRecord$1$1L");
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("mp4_file_path", str, c1656120tCM.LJI);
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartRecordingCommandEventHandlerFactory:startRecordWithResult:");
        sbLIZ.append(num);
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        if (num.intValue() == 0) {
            if (c1656070tCH.LIZJ.Jv2().LIZJ().booleanValue()) {
                C1C7U.LIZIZ("StartRecordingCommandEventHandlerFactory@d1fb.lambda$actualStartRecord$1$1L");
                return;
            }
            c1656070tCH.LIZJ.B3(c1656120tCM);
        } else {
            int iIntValue = num.intValue();
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StartRecordingCommandEventHandlerFactory:onStartRecordFailed ");
            sbLIZ2.append(iIntValue);
            interfaceC1463990oCTLIZLLL2.d(C2188811AlT.LIZIZ(sbLIZ2));
            c1656070tCH.LIZJ.H2(new C1448520nnW(iIntValue));
            C19GS c19gs = c1656070tCH.LIZ;
            C21366318jV.LIZLLL.getClass();
            C1638280sja.LIZ(2131846545, 0, c19gs).LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("start record failed, error code: ");
            sbLIZ3.append(iIntValue);
            C1644050sst c1644050sst = new C1644050sst(C2188811AlT.LIZIZ(sbLIZ3));
            c1644050sst.LIZ = 1;
            c1656070tCH.LIZJ.h81(c1644050sst);
        }
        C1C7U.LIZIZ("StartRecordingCommandEventHandlerFactory@d1fb.lambda$actualStartRecord$1$1L");
    }

    public static final void run$1(ARunnableS19S1300000_25 aRunnableS19S1300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("RecordStickerChallengeAndReuseResolver@626c.onDownloadSuccess$1");
        try {
            ((C1624410sND) aRunnableS19S1300000_25.l1).LJIIIIZZ((EffectListResponse) aRunnableS19S1300000_25.l2, aRunnableS19S1300000_25.s0, (Effect) aRunnableS19S1300000_25.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordStickerChallengeAndReuseResolver@626c.onDownloadSuccess$1");
    }

    public ARunnableS19S1300000_25(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj;
        this.l3 = obj3;
    }
}
