package X;

import X.AbstractC21169117sn;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol;
import java.util.Collection;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21170017sw<CONTEXT extends AbstractC21169117sn> extends AbstractC21169717st<CONTEXT> {
    public final WaterMarkAbilityProtocol<CONTEXT> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final C01GW LJIIJ;

    @Override // X.InterfaceC21170217sy
    public final String LIZIZ() {
        return "WaterMarkAbility";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.17sv] */
    @Override // X.AbstractC21169717st
    public final void LJI() {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIILLIIL();
        }
        this.LJII.LJIIJ(new InterfaceC1398810mVL(this) { // from class: X.17sv
            public final /* synthetic */ C21170017sw<CONTEXT> LIZ;

            @Override // X.InterfaceC1398810mVL
            public final void onCancel() {
                C21170017sw<CONTEXT> c21170017sw = this.LIZ;
                c21170017sw.LIZJ(c21170017sw.LJIIIZ);
            }

            @Override // X.InterfaceC1398810mVL
            public final void onSuccess() {
                this.LIZ.LJFF.getClass();
                C21170017sw<CONTEXT> c21170017sw = this.LIZ;
                c21170017sw.LJ(c21170017sw.LJIIIZ, "");
            }

            {
                this.LIZ = this;
            }

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
            @Override // X.InterfaceC1398810mVL
            public final void onFailed(int i) {
                this.LIZ.LJFF.getClass();
                C21170017sw<CONTEXT> c21170017sw = this.LIZ;
                c21170017sw.LJFF.LIZLLL = i;
                String str = c21170017sw.LJIIIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error code: ");
                sbLIZ.append(i);
                c21170017sw.LIZLLL(i, str, C2188811AlT.LIZIZ(sbLIZ), "");
            }

            @Override // X.InterfaceC1398810mVL
            public final void onProgress(int i) {
                int iLIZ = this.LIZ.LIZJ.LIZ(EnumC19357910oL.WATER_TYPE, i);
                InterfaceC21168717sj interfaceC21168717sj = this.LIZ.LIZ.LIZLLL;
                if (interfaceC21168717sj != null) {
                    interfaceC21168717sj.onProgress(iLIZ);
                }
                this.LIZ.LJI.onProgress(iLIZ);
            }
        });
        WaterMarkAbilityProtocol<CONTEXT> waterMarkAbilityProtocol = this.LJII;
        String str = this.LIZLLL;
        String str2 = this.LJIIIZ;
        C21170817t4 c21170817t4 = this.LJFF;
        waterMarkAbilityProtocol.LJIIJJI(c21170817t4.LJ, c21170817t4.LJFF, c21170817t4.LIZJ, str, str2);
        C1371690lnb.LIZJ("WaterMarkAbility", "finish init");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C21170117sx(this, null), 3);
    }

    @Override // X.AbstractC21169717st
    public final void LJII() {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIILJJIL();
        }
    }

    @Override // X.AbstractC21169717st
    public final void LJIIJJI() {
        this.LJII.LJFF();
    }

    public final C21170617t2 LJIIL() {
        return (C21170617t2) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC21170217sy
    public final void cancel() {
        this.LJII.LIZ();
    }

    @Override // X.AbstractC21169717st
    public final boolean LJFF() {
        return LJIIL().LIZ || LJIIL().LIZJ || LJIIL().LIZLLL || LJIIL().LJ || (((Collection) LJIIL().LJFF.second).isEmpty() ^ true);
    }

    public final boolean LJIILIIL() {
        return LJIIL().LIZ || LJIIL().LIZJ || LJIIL().LIZLLL || LJIIL().LJ || (((Collection) LJIIL().LJFF.second).isEmpty() ^ true);
    }

    public C21170017sw(CONTEXT context, WaterMarkAbilityProtocol<CONTEXT> waterMarkAbilityProtocol) {
        String strLIZIZ;
        String strLIZIZ2;
        super(context);
        this.LJII = waterMarkAbilityProtocol;
        if (C289400BVy.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.LJ);
            sbLIZ.append("_watermark");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = context.LJ;
        }
        this.LJIIIIZZ = strLIZIZ;
        if (C289400BVy.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(context.LIZIZ());
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(context.LIZIZ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(context.LIZ());
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(context.LIZIZ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        this.LJIIIZ = strLIZIZ2;
        this.LJIIJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 442));
    }

    @Override // X.AbstractC21169717st
    public final void LJIIIZ(String str, String str2) {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIIZILJ();
        }
    }

    @Override // X.AbstractC21169717st
    public final void LJIIIIZZ(int i, String str, String str2, String str3) {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIILL(i, this.LIZLLL, str2);
        }
    }
}
