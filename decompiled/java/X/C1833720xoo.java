package X;

import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.AnchorFragmentListResult;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xoo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$updateVideoRevivedInfo$1", f = "LiveHighlightViewModel.kt", l = {731}, m = "invokeSuspend")
public final class C1833720xoo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveHighlightViewModel LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final /* synthetic */ LiveHighlightViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ long LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833720xoo(LiveHighlightViewModel liveHighlightViewModel, String str, String str2, boolean z, boolean z2, long j, InterfaceC1364105Vn<? super C1833720xoo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = liveHighlightViewModel;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1833720xoo(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        Object c098200Yq;
        LiveHighlightViewModel liveHighlightViewModel;
        long j;
        boolean z;
        boolean z2;
        Object obj2;
        AnchorLiveFragmentListResponse.ResponseData responseData;
        String str;
        List<LiveFragmentDetail> list;
        boolean z3;
        Object objLJLZ = obj;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.updateVideoRevivedInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            if (i != 0) {
                if (i == 1) {
                    j = this.LLILLL;
                    Object obj3 = this.LLILLJJLI;
                    liveHighlightViewModel = this.LL;
                    C155000ia.LIZIZ(objLJLZ);
                    obj2 = obj3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJLZ);
                liveHighlightViewModel = this.LLILZIL;
                String str2 = this.LLILZLL;
                String str3 = this.LLIZ;
                boolean z4 = this.LLIZLLLIL;
                boolean z5 = this.LLJ;
                j = this.LLJI;
                C323990Cmz c323990Cmz = liveHighlightViewModel.LL.LLILLJJLI;
                if (z4) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = liveHighlightViewModel.LLILLL;
                if (z5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                this.LL = liveHighlightViewModel;
                this.LLILLJJLI = str2;
                this.LLILLL = j;
                this.LLILZ = 1;
                objLJLZ = c323990Cmz.LJLZ(str2, str3, z, i2, boolValueOf, null, this);
                obj2 = str2;
                if (objLJLZ == objLJFF) {
                    C1C7U.LIZIZ("LiveHighlightViewModel@9d4.updateVideoRevivedInfo$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) objLJLZ;
            c098200Yq = null;
            LiveFragmentDetail liveFragmentDetail = null;
            liveFragmentDetail = null;
            LiveFragmentDetail liveFragmentDetail2 = null;
            c098200Yq = null;
            if (c470590Icr != null && (responseData = (AnchorLiveFragmentListResponse.ResponseData) c470590Icr.data) != null) {
                AnchorFragmentListResult anchorFragmentListResult = responseData.roomMap.get(obj2);
                if (anchorFragmentListResult != null && (list = anchorFragmentListResult.fragmentList) != null) {
                    Iterator<LiveFragmentDetail> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LiveFragmentDetail next = it2.next();
                        if (next.fragmentId == j) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            liveFragmentDetail = next;
                            break;
                        }
                    }
                    liveFragmentDetail2 = liveFragmentDetail;
                }
                if (liveFragmentDetail2 == null) {
                    LiveHighlightViewModel.EQ2(liveHighlightViewModel, j, 3, false, null, null, 24);
                } else {
                    int i3 = liveFragmentDetail2.revertStatus;
                    boolean z6 = liveFragmentDetail2.showRevertVideo;
                    VideoMetaInfo videoMetaInfo = liveFragmentDetail2.revertMp4VideoMetaInfo;
                    if (videoMetaInfo == null || (str = videoMetaInfo.url) == null) {
                        str = "";
                    }
                    LiveHighlightViewModel.EQ2(liveHighlightViewModel, j, i3, z6, str, null, 16);
                }
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LiveHighlightViewModel liveHighlightViewModel2 = this.LLILZIL;
        long j2 = this.LLJI;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LiveHighlightViewModel.EQ2(liveHighlightViewModel2, j2, 3, false, null, null, 24);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.updateVideoRevivedInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
