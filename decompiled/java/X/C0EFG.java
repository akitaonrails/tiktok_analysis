package X;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic.EffectAnimFuncItemController;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EFG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFG implements C0EIO {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0E48 LLILLL;
    public final C0EGY LLILZ;
    public final InterfaceC362350EIn LLILZIL;
    public final VideoPublishEditModel LLILZLL;
    public final C0EFH LLIZ;
    public final C0EIE LLIZLLLIL = C0EIE.VIDEO_ANIMATION;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(406));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1623));
    public final InterfaceC359850E8x LLJIJIL;
    public final InterfaceC359940E9g LLJILJIL;

    @Override // X.C0EIO
    public final boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLIILIL() {
        return false;
    }

    public final EffectAnimFuncItemController LIZ() {
        return (EffectAnimFuncItemController) this.LLJI.getValue();
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        EffectAnimFuncItemController effectAnimFuncItemControllerLIZ = LIZ();
        String str = (String) this.LLJ.getValue();
        Keva keva = effectAnimFuncItemControllerLIZ.LLJILLL;
        if (keva == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ep_video_anim_guide_show_");
        sbLIZ.append(str);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r2.getBoolean(X.C2188811AlT.LIZIZ(r1), false) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.util.List<java.lang.String> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "bottom_item_root_effects"
            boolean r0 = r6.contains(r0)
            r4 = 0
            if (r0 == 0) goto L46
            com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic.EffectAnimFuncItemController r1 = r5.LIZ()
            X.01GW r0 = r5.LLJ
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            com.bytedance.keva.Keva r2 = r1.LLJILLL
            if (r2 == 0) goto L2f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ep_video_anim_guide_show_"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            boolean r0 = r2.getBoolean(r0, r4)
            if (r0 != 0) goto L46
        L2f:
            com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic.EffectAnimFuncItemController r1 = r5.LIZ()
            X.0EFH r0 = r5.LLIZ
            r0.k51()
            r1.getClass()
            X.0E8x r1 = r5.LLJIJIL
            com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic.EffectAnimFuncItemController r0 = r5.LIZ()
            boolean r0 = r0.LJI(r1)
            return r0
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EFG.LIZIZ(java.util.List):boolean");
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        return LIZIZ(list);
    }

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        RecyclerView recyclerViewLLII;
        LinearLayoutManager linearLayoutManager;
        int iLJII;
        InterfaceC359940E9g interfaceC359940E9g = this.LLJILJIL;
        if (interfaceC359940E9g != null && (recyclerViewLLII = interfaceC359940E9g.LLII()) != null) {
            RecyclerView.LayoutManager layoutManager = recyclerViewLLII.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                InterfaceC359850E8x interfaceC359850E8x = this.LLJIJIL;
                if (interfaceC359850E8x != null && (iLJII = interfaceC359850E8x.LJII("root_item", "bottom_item_root_effects")) != -1) {
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition > iLJII || iLJII > iFindLastCompletelyVisibleItemPosition) {
                        recyclerViewLLII.scrollToPosition(iLJII);
                    }
                    EffectAnimFuncItemController effectAnimFuncItemControllerLIZ = LIZ();
                    this.LLIZ.k51();
                    effectAnimFuncItemControllerLIZ.getClass();
                    return LIZ().LJI(this.LLJIJIL);
                }
                return LIZIZ(list);
            }
            return LIZIZ(list);
        }
        return LIZIZ(list);
    }

    public C0EFG(C19EG c19eg, Lifecycle lifecycle, C0E48 c0e48, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn, VideoPublishEditModel videoPublishEditModel, C0EFH c0efh) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0e48;
        this.LLILZ = c0egy;
        this.LLILZIL = interfaceC362350EIn;
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = c0efh;
        this.LLJIJIL = c0egy.B20();
        this.LLJILJIL = c0egy.AZ0();
    }
}
