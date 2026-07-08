package Y;

import X.C05YF;
import X.C0CHQ;
import X.C0ELN;
import X.C0ETY;
import X.C1441830ncj;
import X.C1455250nyN;
import X.C1455270nyP;
import X.C1458390o3R;
import X.C1465680oFC;
import X.C1465690oFD;
import X.C1627400sS2;
import X.C1641640sp0;
import X.C1662160tM6;
import X.C1DRG;
import X.C1EOF;
import X.C201955140j;
import X.C297400BlC;
import X.C348100Dkm;
import X.C365940EWi;
import X.C390650FTj;
import X.EnumC1641550sor;
import X.InterfaceC1446740nke;
import X.InterfaceC1455610nyx;
import X.InterfaceC1460000o62;
import X.InterfaceC1461350o8D;
import X.InterfaceC1462580oAC;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import dmt.av.video.StoredLiveData;
import java.util.List;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public class AObserverS184S0200000_22 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onChanged$2(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        ((StoredLiveData) aObserverS184S0200000_22.l0).lambda$observe$0((InterfaceC1462580oAC) aObserverS184S0200000_22.l1, obj);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        ((C1441830ncj) aObserverS184S0200000_22.l0).LJII((InfoStickerModel) obj, ((VideoPublishEditModel) aObserverS184S0200000_22.l1).getOutVideoWidth(), ((VideoPublishEditModel) aObserverS184S0200000_22.l1).getOutVideoHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS184S0200000_22 r46, java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS184S0200000_22.onChanged$1(Y.AObserverS184S0200000_22, java.lang.Object):void");
    }

    public static final void onChanged$3(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        C1465680oFC c1465680oFC = (C1465680oFC) aObserverS184S0200000_22.l0;
        c1465680oFC.LLJ = (List) obj;
        c1465680oFC.X1((InitialFilterConfig) aObserverS184S0200000_22.l1);
    }

    public static final void onChanged$4(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        ((C1465680oFC) aObserverS184S0200000_22.l0).X1((InitialFilterConfig) aObserverS184S0200000_22.l1);
    }

    public static final void onChanged$5(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        ((C1465690oFD) aObserverS184S0200000_22.l0).X1((InitialFilterConfig) aObserverS184S0200000_22.l1);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$6(Y.AObserverS184S0200000_22 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS184S0200000_22.onChanged$6(Y.AObserverS184S0200000_22, java.lang.Object):void");
    }

    public static final void onChanged$7(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        boolean z;
        String itemTag;
        Integer num = (Integer) obj;
        InterfaceC1446740nke interfaceC1446740nkeJY0 = ((C1455270nyP) aObserverS184S0200000_22.l0).JY0();
        if (num != null && num.intValue() == 3) {
            z = false;
        } else {
            z = true;
        }
        interfaceC1446740nkeJY0.uG0(z);
        if (!C1455270nyP.N5((C1455270nyP) aObserverS184S0200000_22.l0, num.intValue())) {
            if (num.intValue() == 1) {
                itemTag = "music";
            } else {
                C1EOF[] c1eofArrValues = C1EOF.values();
                int length = c1eofArrValues.length;
                int i = 0;
                while (true) {
                    itemTag = null;
                    if (i >= length) {
                        break;
                    }
                    C1EOF c1eof = c1eofArrValues[i];
                    if (c1eof.getType() == num.intValue()) {
                        itemTag = c1eof.getItemTag();
                        break;
                    }
                    i++;
                }
            }
            C0CHQ.LIZ().LJI().LJFF(((C1455270nyP) aObserverS184S0200000_22.l0).O4(), itemTag);
            C1458390o3R c1458390o3R = C1458390o3R.LIZ;
            int iIntValue = num.intValue();
            c1458390o3R.getClass();
            C1458390o3R.LJJIIJZLJL(iIntValue);
            if (((InterfaceC1455610nyx) aObserverS184S0200000_22.l1) instanceof InterfaceC1460000o62) {
                ((C1455270nyP) aObserverS184S0200000_22.l0).E5(num.intValue());
            }
        }
    }

    public static final void onChanged$8(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        C1641640sp0 c1641640sp0 = (C1641640sp0) obj;
        M m = c1641640sp0.LIZ;
        if (c1641640sp0.LIZIZ == EnumC1641550sor.SUCCESS && m != 0) {
            ((LiveData) ((C1627400sS2) aObserverS184S0200000_22.l0).LJ.getValue()).removeObserver(aObserverS184S0200000_22);
            ((C1627400sS2) aObserverS184S0200000_22.l0).LIZ((Effect) aObserverS184S0200000_22.l1);
        }
    }

    public static final void onChanged$9(AObserverS184S0200000_22 aObserverS184S0200000_22, Object obj) {
        int i;
        C201955140j.LIZJ(C1662160tM6.LIZIZ, "receive prepare done event in edit page");
        if (C365940EWi.LIZLLL(((C1455250nyN) aObserverS184S0200000_22.l0).getEditModel())) {
            C1DRG c1drg = (C1DRG) aObserverS184S0200000_22.l1;
            if (c1drg != null) {
                ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS601S0100000_22((C1455250nyN) aObserverS184S0200000_22.l0, 731));
            }
        } else if (C297400BlC.LIZ()) {
            C1455250nyN c1455250nyN = (C1455250nyN) aObserverS184S0200000_22.l0;
            Scene scene = (Scene) c1455250nyN.LLJJIII.getValue();
            if (C390650FTj.LIZ()) {
                i = R.id.grm;
            } else {
                i = R.id.grl;
            }
            c1455250nyN.add(i, scene, "EditStickerDeleteScene");
            c1455250nyN.show(scene);
        }
        C1DRG c1drg2 = (C1DRG) aObserverS184S0200000_22.l1;
        if (c1drg2 != null) {
            VideoPublishEditModel editModel = ((C1455250nyN) aObserverS184S0200000_22.l0).getEditModel();
            C1455250nyN c1455250nyN2 = (C1455250nyN) aObserverS184S0200000_22.l0;
            if (C365940EWi.LIZLLL(editModel)) {
                ((C0ETY) c1drg2.LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS601S0100000_22(c1455250nyN2, 733));
            } else {
                InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) ((C05YF) c1drg2.LJII(InterfaceC1461350o8D.class, null));
                c1455250nyN2.LLJLLIL = interfaceC1461350o8D;
                c1455250nyN2.LLLZIL(interfaceC1461350o8D);
            }
        }
        C348100Dkm c348100DkmLLLLZLLLI = ((C1455250nyN) aObserverS184S0200000_22.l0).LLLLZLLLI();
        if (c348100DkmLLLLZLLLI != null) {
            C0ELN.LIZIZ(((C1455250nyN) aObserverS184S0200000_22.l0).getEditModel(), c348100DkmLLLLZLLLI.LIZ.getModel());
        }
    }

    public AObserverS184S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
