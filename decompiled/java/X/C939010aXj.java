package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperUrlEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939010aXj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ DataChannel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C939010aXj(boolean z, Long l, String str, Long l2, Long l3, int i, DataChannel dataChannel) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = l;
        this.LLILLL = str;
        this.LLILZ = l2;
        this.LLILZIL = l3;
        this.LLILZLL = i;
        this.LLIZ = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C939000aXi.LIZLLL = this.LLILLJJLI;
        C939000aXi c939000aXi = C939000aXi.LIZ;
        String str = this.LLILLL;
        c939000aXi.getClass();
        C939000aXi.LJ = str;
        C939000aXi.LJFF = this.LLILZ;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long l = this.LLILZIL;
        c930480aJy.getClass();
        C939000aXi.LJI = C930480aJy.LJJIJL(l);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalidateSei: source = ");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (C1533950q1J.LJ(this.LLILLL) || this.LL) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).du0("shared_bg");
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).We1("aigc_play_info", C939000aXi.LIZ());
            DataChannel dataChannel = this.LLIZ;
            if (dataChannel != null) {
                dataChannel.zW(AigcWallpaperUrlEvent.class, this.LLILLL);
            }
        } else {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).du0("aigc_play_info");
            DataChannel dataChannel2 = this.LLIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(AigcWallpaperUrlEvent.class, "");
            }
            if (this.LLILZLL == 2) {
                C939000aXi.LIZIZ(this.LLIZ);
            }
        }
        return Unit.LIZ;
    }
}
