package X;

import Y.AcS188S0300000_17;
import Y.AcS355S0200000_17;
import android.content.DialogInterface;
import android.widget.CompoundButton;
import com.bytedance.android.live.rank.impl.sticker.dialog.RankStickerPreviewFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.RankStickerAutoSwitchChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0g4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151630g4f implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
        }
    }

    public C1151630g4f(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C1151630g4f c1151630g4f, CompoundButton compoundButton, boolean z) {
        ((AbstractC1149720g1a) c1151630g4f.l0).LIZJ().LLILLJJLI = z;
    }

    public static final void onCheckedChanged$1(C1151630g4f c1151630g4f, CompoundButton compoundButton, boolean z) {
        ((C1119220fEO) c1151630g4f.l0).LIZ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$2(C1151630g4f c1151630g4f, CompoundButton compoundButton, boolean z) {
        final RankTypeV2 rankTypeV2;
        RankStickerPreviewFragment rankStickerPreviewFragment;
        DataChannel dataChannel;
        boolean z2 = !InterfaceC1106030et7.C9.LIZIZ().booleanValue();
        C1119210fEN.LIZ.getClass();
        if (InterfaceC1094280eaA.Md.LIZIZ().booleanValue()) {
            rankTypeV2 = RankTypeV2.LJIIL;
        } else if (InterfaceC1094280eaA.Qd.LIZIZ().booleanValue()) {
            rankTypeV2 = RankTypeV2.LIZ;
        } else if (InterfaceC1106030et7.B9.LIZIZ().booleanValue()) {
            rankTypeV2 = RankTypeV2.LJIL;
        } else if (InterfaceC1094280eaA.Nd.LIZIZ().booleanValue()) {
            rankTypeV2 = RankTypeV2.LJIILJJIL;
        } else {
            rankTypeV2 = null;
        }
        if (z && z2 && rankTypeV2 != null) {
            final RankStickerPreviewFragment rankStickerPreviewFragment2 = (RankStickerPreviewFragment) c1151630g4f.l0;
            rankStickerPreviewFragment2.getClass();
            C013C c013c = new C013C();
            C1119220fEO c1119220fEO = new C1119220fEO(new AwS584S0100000_5(c013c, 1199));
            String strLJIJJ = C497740JfY.LJIJJ(2131855520, C1119210fEN.LIZLLL(rankStickerPreviewFragment2.LLILLJJLI));
            C782110Um9 c782110Um9 = new C782110Um9(rankStickerPreviewFragment2.getContext());
            c782110Um9.LJIIZILJ(2131855521);
            c782110Um9.LJIIIZ(strLJIJJ);
            c782110Um9.LJIJJ = c1119220fEO;
            c782110Um9.LJIILIIL(2131855518, new AcS188S0300000_17(c013c, rankStickerPreviewFragment2, rankTypeV2, 3));
            c782110Um9.LJIIJ(2131855517, new AcS355S0200000_17(rankStickerPreviewFragment2, rankTypeV2, 2));
            c782110Um9.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0fEP
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    rankStickerPreviewFragment2.NR().setChecked(false);
                    RankStickerPreviewFragment rankStickerPreviewFragment3 = rankStickerPreviewFragment2;
                    C1119410fEh.LJFF(rankStickerPreviewFragment3.LL, rankTypeV2, rankStickerPreviewFragment3.LLILLJJLI, "cancel", "switch_auto_set");
                }
            };
            C786410Ut5.E4(c782110Um9.LIZ());
            C1119410fEh.LJI(rankStickerPreviewFragment2.LL, rankTypeV2, rankStickerPreviewFragment2.LLILLJJLI, "switch_auto_set");
            return;
        }
        C1119210fEN.LJI(((RankStickerPreviewFragment) c1151630g4f.l0).LLILLJJLI, z);
        if (!z || (dataChannel = (rankStickerPreviewFragment = (RankStickerPreviewFragment) c1151630g4f.l0).LL) == null) {
            return;
        }
        dataChannel.LC0(RankStickerAutoSwitchChangeEvent.class, rankStickerPreviewFragment.LLILLJJLI);
    }

    public static final void onCheckedChanged$3(C1151630g4f c1151630g4f, CompoundButton compoundButton, boolean z) {
        ((C1116300f9g) c1151630g4f.l0).LIZ.invoke(Boolean.valueOf(z));
    }
}
