package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743190vSn extends C09AY implements Function2<UIAssem, BannerData, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ EcTrendingBannerAssem LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743190vSn(C013C c013c, View view, View view2, EcTrendingBannerAssem ecTrendingBannerAssem, View view3) {
        super(2);
        this.LL = c013c;
        this.LLILLJJLI = view;
        this.LLILLL = view2;
        this.LLILZ = ecTrendingBannerAssem;
        this.LLILZIL = view3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.03wf, X.0DXR] */
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
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.bytedance.assem.arch.core.UIAssem r12, com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerData r13) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1743190vSn.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
