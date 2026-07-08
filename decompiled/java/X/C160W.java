package X;

import X.C016X;
import X.C20703515zt;
import X.InterfaceC0241006d;
import X.InterfaceC1282004zy;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$subtitleParamsProvider$2$1;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.160W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160W extends C09AY implements Function0<CLACaptionAssemV2$subtitleParamsProvider$2$1> {
    public final /* synthetic */ CLACaptionAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160W(CLACaptionAssemV2 cLACaptionAssemV2) {
        super(0);
        this.LL = cLACaptionAssemV2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$subtitleParamsProvider$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final CLACaptionAssemV2$subtitleParamsProvider$2$1 invoke() {
        final CLACaptionAssemV2 cLACaptionAssemV2 = this.LL;
        return new ETParamsProvider<C016X>() { // from class: com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$subtitleParamsProvider$2$1
            /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C016X Mb0() {
                /*
                    r22 = this;
                    r3 = r22
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2 r0 = r1
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2 r0 = r0.Bp()
                    java.lang.Object r0 = r0.getItem()
                    com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
                    r17 = 0
                    if (r0 == 0) goto Lb8
                    com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
                    if (r2 == 0) goto Lba
                    com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = X.C20702515zj.LIZLLL(r2)
                L1c:
                    r7 = 0
                    r6 = 1
                    if (r0 != 0) goto Lb6
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2 r0 = r1
                    X.161N r1 = r0.Ep()
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2 r0 = r1
                    X.161N r0 = r0.Ep()
                    java.lang.String r0 = r0.LLIIZ()
                    boolean r0 = r1.LJJIIZ(r2, r0)
                    if (r0 != 0) goto Lb6
                    r5 = 0
                L37:
                    int r4 = X.C20703515zt.LJIILJJIL(r2)
                    if (r2 == 0) goto Lb3
                    com.ss.android.ugc.aweme.service.ICLACaptionService r0 = X.C0RT2.LIZ()
                    boolean r0 = r0.LIZJ(r2)
                    if (r0 == 0) goto Lb3
                    if (r4 != r6) goto Lb0
                    X.161N r1 = X.C20703515zt.LIZIZ
                    java.lang.String r0 = r1.LLIIZ()
                    boolean r0 = r1.LLIIIL(r2, r0)
                    if (r0 == 0) goto Lb0
                    java.lang.String r13 = "realtime"
                L57:
                    boolean r8 = X.C20703515zt.LJIIZILJ(r2)
                    java.lang.String r9 = X.C20703515zt.LJIIJJI(r2)
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2 r0 = r1
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2 r0 = r0.Bp()
                    X.160A r0 = r0.wQ2()
                    X.0RuD r0 = r0.LLILLJJLI
                    X.160B r0 = r0.LLILZIL
                    java.lang.String r11 = r0.getCaptionShowType()
                    java.lang.String r12 = X.C20703515zt.LJIILIIL(r2)
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2 r0 = r1
                    com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2 r0 = r0.Bp()
                    boolean r0 = r0.w1()
                    java.lang.String r16 = X.C20703515zt.LJFF(r2, r0)
                    com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = X.C20702515zj.LIZLLL(r2)
                    if (r0 == 0) goto L9f
                    long r0 = r0.translationType
                    r3 = 1
                    int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r2 != 0) goto Lad
                    java.lang.String r17 = "user_edit"
                L9f:
                    r18 = 0
                    r21 = 7168(0x1c00, float:1.0045E-41)
                    X.016X r7 = new X.016X
                    r19 = r18
                    r20 = r18
                    r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    return r7
                Lad:
                    java.lang.String r17 = "auto"
                    goto L9f
                Lb0:
                    java.lang.String r13 = "offline"
                    goto L57
                Lb3:
                    java.lang.String r13 = ""
                    goto L57
                Lb6:
                    r5 = 1
                    goto L37
                Lb8:
                    r2 = r17
                Lba:
                    r0 = r17
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$subtitleParamsProvider$2$1.Mb0():X.016X");
            }

            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC1282004zy getParam() {
                if (lt2(C016X.class)) {
                    return Mb0();
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
                VideoItemParams item;
                Aweme aweme;
                if (!Intrinsics.LJFF(cls, C016X.class) || (item = cLACaptionAssemV2.Bp().getItem()) == null || (aweme = item.getAweme()) == null) {
                    return false;
                }
                return C20703515zt.LJIIZILJ(aweme);
            }
        };
    }
}
