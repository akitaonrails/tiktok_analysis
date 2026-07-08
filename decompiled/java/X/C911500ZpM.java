package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.utils.OnboardingCardActionUtil$preloadAccessCriteriaCopy$1", f = "OnboardingCardActionUtil.kt", l = {188}, m = "invokeSuspend")
public final class C911500ZpM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911500ZpM(String str, InterfaceC1364105Vn<? super C911500ZpM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C911500ZpM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC911440ZpG enumC911440ZpG;
        EnumC911440ZpG enumC911440ZpG2;
        GroupPreviewDisplayMeta next;
        GroupForPreview groupForPreview;
        C1C7U.LIZ("OnboardingCardActionUtil@c222.preloadAccessCriteriaCopy$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String strLIZIZ = C461720I8s.LIZIZ();
            C11FW.LIZ.getClass();
            if (C294790Bgz.LIZ()) {
                enumC911440ZpG = EnumC911440ZpG.ALL_PUBLIC_GROUP;
            } else {
                enumC911440ZpG = EnumC911440ZpG.FAN_GROUP_ONLY;
            }
            List<GroupPreviewDisplayMeta> listLIZIZ = C1229870i6r.LIZIZ(strLIZIZ, strLIZIZ, enumC911440ZpG);
            if (listLIZIZ != null) {
                String str = this.LLILLJJLI;
                Iterator<GroupPreviewDisplayMeta> it2 = listLIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(String.valueOf(next.groupInfo.convShortId), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                GroupPreviewDisplayMeta groupPreviewDisplayMeta = next;
                if (groupPreviewDisplayMeta != null && (groupForPreview = groupPreviewDisplayMeta.groupInfo) != null && groupForPreview.accessCriteriaDesc != null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OnboardingCardActionUtil@c222.preloadAccessCriteriaCopy$1");
                    return unit;
                }
            }
            C1229870i6r c1229870i6r = C1229870i6r.LIZ;
            C11FW.LIZ.getClass();
            if (C294790Bgz.LIZ()) {
                enumC911440ZpG2 = EnumC911440ZpG.ALL_PUBLIC_GROUP;
            } else {
                enumC911440ZpG2 = EnumC911440ZpG.FAN_GROUP_ONLY;
            }
            this.LL = 1;
            if (c1229870i6r.LIZ(enumC911440ZpG2, this) == objLJFF) {
                C1C7U.LIZIZ("OnboardingCardActionUtil@c222.preloadAccessCriteriaCopy$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OnboardingCardActionUtil@c222.preloadAccessCriteriaCopy$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
