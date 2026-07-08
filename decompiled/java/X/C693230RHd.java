package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.feed.assem.caption.VideoCLACaptionDebugTrigger;
import com.ss.android.ugc.aweme.feed.assem.caption.VideoCLACaptionTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizTopAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693230RHd extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BizTopAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693230RHd(BizTopAreaComponent bizTopAreaComponent) {
        super(1);
        this.LL = bizTopAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Object obj;
        C19719912Dl c19719912DlLJI;
        Assembler assembler2 = assembler;
        C0RJE.LIZJ(assembler2, this.LL, new C693250RHf(new VideoCLACaptionTrigger()));
        C0RJE.LIZJ(assembler2, this.LL, new C693220RHc(new VideoCLACaptionDebugTrigger()));
        IAdAssemService iAdAssemService = (IAdAssemService) ServiceManager.get().getService(IAdAssemService.class);
        if (iAdAssemService != null && (c19719912DlLJI = iAdAssemService.LJI()) != null) {
            assembler2.MQ2(this.LL, new C658050PrX(c19719912DlLJI));
        }
        BizTopAreaComponent bizTopAreaComponent = this.LL;
        C724270Sb3 c724270Sb3 = bizTopAreaComponent.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (((aweme != null && AwemeExtKt.isPhotoMode(aweme)) || Intrinsics.LJFF(bizTopAreaComponent.jm().LIZ(), "cell_photos")) && !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFF().LIZJ()) {
            assembler2.MQ2(this.LL, AFwS243S0000000_11.get$arr$(557));
        }
        assembler2.LQ2(this.LL, AFwS243S0000000_11.get$arr$(558));
        C0RJE.LIZJ(assembler2, this.LL, new C693240RHe());
        return Unit.LIZ;
    }
}
