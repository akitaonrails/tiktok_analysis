package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.model.RFCDraftModel;
import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$clickDraft$1", f = "DraftBoxFragment.kt", l = {1741}, m = "invokeSuspend")
public final class C561090LzX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561090LzX(DraftBoxFragment draftBoxFragment, C0M0P c0m0p, int i, String str, String str2, InterfaceC1364105Vn<? super C561090LzX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxFragment;
        this.LLILLL = c0m0p;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561090LzX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.0Lza] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0Lza] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0Lza] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        boolean z;
        boolean z2;
        C0M0W c0m0w;
        Object objLJ = obj;
        C1C7U.LIZ("DraftBoxFragment@80e.clickDraft$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            C556820Lse c556820Lse = C556820Lse.LIZ;
            Context context = this.LLILLJJLI.getContext();
            C0M0P c0m0p = this.LLILLL;
            int i2 = this.LLILZ;
            C561130Lzb c561130LzbWR = this.LLILLJJLI.WR();
            C19567911h7 c19567911h7 = (C19567911h7) this.LLILLJJLI.LLJJIJI.getValue();
            Bundle arguments = this.LLILLJJLI.getArguments();
            if (arguments != null) {
                string = arguments.getString("star_atlas_object");
            } else {
                string = null;
            }
            DraftBoxFragment draftBoxFragment = this.LLILLJJLI;
            boolean z3 = draftBoxFragment.LLJJJJ;
            RFCDraftModel rFCDraftModel = draftBoxFragment.LLJLIL;
            this.LL = 1;
            objLJ = c556820Lse.LJ(context, c0m0p, i2, c561130LzbWR, c19567911h7, string, z3, rFCDraftModel, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("DraftBoxFragment@80e.clickDraft$1");
                return objLJFF;
            }
        }
        C561100LzY c561100LzY = (C561100LzY) objLJ;
        if (c561100LzY != null && c561100LzY.LIZ != null) {
            if (c561100LzY.LIZIZ && (c0m0w = this.LLILLJJLI.LLLFZ) != null) {
                c0m0w.LIZIZ();
            }
            if (this.LLILZ == -1) {
                PostLandingModel postLandingModel = c561100LzY.LIZ.LIZ.postLandingModel;
                if (!this.LLILLJJLI.LLJLLIL && C0C64.LJIILLIIL().LJIJ(31744, 0, "draft_box_post_btn_return_enable", true) != 1) {
                    z = false;
                } else {
                    z = true;
                }
                postLandingModel.landingBack = z;
                DraftInfoModel draftInfoModel = c561100LzY.LIZ.LIZ.draftInfoModel;
                if (!this.LLILLJJLI.LLJLLIL && C0C64.LJIILLIIL().LJIJ(31744, 0, "draft_box_post_then_delete_draft", true) != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                draftInfoModel.deleteAfterPublished = z2;
                c561100LzY.LIZ.LIZ.draftBoxModel.isPostInDraftBox = true;
            }
            if (c561100LzY.LJ) {
                if (c561100LzY.LIZJ) {
                    if (c561100LzY.LIZLLL) {
                        DraftBoxFragment draftBoxFragment2 = this.LLILLJJLI;
                        draftBoxFragment2.OR(c561100LzY.LIZ, draftBoxFragment2.LLLLJI, new DraftListenerAdapter() { // from class: X.0Lza
                            @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
                            public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                                C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxFragment", "onUpdated");
                            }
                        }, this.LLILZIL, this.LLILZLL);
                    } else {
                        C19EG activity = this.LLILLJJLI.getActivity();
                        if (activity != null) {
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.messageRes(2131829827);
                            creativeToastBuilder.isTuxToastLegacy(true);
                            C1390380mHk.LIZ(activity, 4005, creativeToastBuilder);
                        }
                    }
                } else {
                    DraftBoxFragment draftBoxFragment3 = this.LLILLJJLI;
                    draftBoxFragment3.OR(c561100LzY.LIZ, draftBoxFragment3.LLLLJI, new DraftListenerAdapter() { // from class: X.0Lza
                        @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
                        public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxFragment", "onUpdated");
                        }
                    }, this.LLILZIL, this.LLILZLL);
                }
            } else {
                AwemeDraft awemeDraft = c561100LzY.LIZ;
                awemeDraft.LJIJI = 0;
                DraftBoxFragment draftBoxFragment4 = this.LLILLJJLI;
                if (draftBoxFragment4.LLJJJJJIL) {
                    awemeDraft.LJIJI = 2000;
                }
                if (draftBoxFragment4.LLJJL) {
                    awemeDraft.LJIJI = LivePreCreateNextRoomPlayer.ENABLE;
                }
                draftBoxFragment4.OR(awemeDraft, draftBoxFragment4.LLLLJI, new DraftListenerAdapter() { // from class: X.0Lza
                    @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
                    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                        C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxFragment", "onUpdated");
                    }
                }, this.LLILZIL, this.LLILZLL);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxFragment@80e.clickDraft$1");
            return unit;
        }
        C0M0W c0m0w2 = this.LLILLJJLI.LLLFZ;
        if (c0m0w2 != null) {
            c0m0w2.LIZIZ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.clickDraft$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
