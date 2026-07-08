package X;

import Y.AfS116S0300000_27;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0wv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799190wv7 extends AbstractC1799100wuy {
    public final C11NJ LLILLL = new C11NJ();

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        this.LLILLL.dispose();
        super.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, X.01kM] */
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
    public final void LIZJ(InterfaceC1799120wv0 interfaceC1799120wv0, CompletionBlock completionBlock) {
        boolean z;
        String str;
        String str2;
        C1499850p8J c1499850p8JCreateBuilder;
        String albumId = interfaceC1799120wv0.getAlbumId();
        String episodeId = interfaceC1799120wv0.getEpisodeId();
        if (albumId != null && albumId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            str = albumId;
        } else {
            str = null;
        }
        if (episodeId != null && episodeId.length() != 0) {
            str2 = episodeId;
        } else {
            str2 = null;
        }
        C2195221Avo.LJIIL = new C1048270dNx(str, str2);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurrentDramaInfo, albumId:");
        sbLIZ.append(albumId);
        sbLIZ.append(", episodeId:");
        sbLIZ.append(episodeId);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1799210wv9.LIZ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("url host:");
        String str3 = C0CQT.LIZJ;
        sbLIZ2.append(str3);
        C2188811AlT.LIZIZ(sbLIZ2);
        Gson gsonLIZ = new e().LIZ();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str3)) != null) {
            c1499850p8JCreateBuilder.LIZJ(new C2336109Dj(gsonLIZ));
            InterfaceC1799210wv9 interfaceC1799210wv9 = (InterfaceC1799210wv9) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1799210wv9.class);
            if (interfaceC1799210wv9 != null) {
                C259800zU c259800zU = new C259800zU();
                ?? LJJLL = interfaceC1799210wv9.LIZ(interfaceC1799120wv0.getClientKey(), interfaceC1799120wv0.getAlbumId(), interfaceC1799120wv0.getEpisodeId(), interfaceC1799120wv0.getVid()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS116S0300000_27(completionBlock, c259800zU, this, 3), new AfS116S0300000_27(completionBlock, c259800zU, this, 4));
                c259800zU.element = LJJLL;
                this.LLILLL.LIZ(LJJLL);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -100, "Drama info service unavailable", null, 4);
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC1799120wv0) xBaseParamModel, completionBlock);
    }
}
