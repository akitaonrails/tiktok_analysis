package X;

import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performance.MediaUploadPerformanceMonitor;
import com.ss.android.ugc.aweme.services.dm.DMPath;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256631DUf extends AbstractC873650YPb {
    public final String LIZIZ;
    public C1DUR LIZJ;
    public final boolean LIZLLL;
    public final Map<String, String> LJ;
    public final BaseShortVideoContext LJFF;
    public final C0Y3I LJI;
    public final C2256701DUm LJII;
    public final C1DV3 LJIIIIZZ;

    @Override // X.AbstractC873650YPb
    public final Object LIZ(final C873910YQb c873910YQb, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
        C18ZL c18zl;
        String uuid;
        Object localCache;
        String str;
        AbstractC1157700gES abstractC1157700gESRemove;
        C1157690gER c1157690gER;
        C21682519tP.LIZ("PublishVideoStep start execute PublishVideoWithUploadStep");
        IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
        if (iMediaPublishManager == null) {
            return C873780YPo.LIZ;
        }
        if (this.LIZIZ != null) {
            c18zl = C18ZL.SYSTEM_ALBUM;
        } else if (this.LIZJ.LJIIJJI) {
            c18zl = C18ZL.MAIN_RECORD;
        } else if (this.LIZLLL) {
            c18zl = C18ZL.DM_RECORD;
        } else {
            c18zl = C18ZL.DM_ALBUM;
        }
        C869590Y9l c869590Y9l = c873910YQb.LIZ;
        if (c869590Y9l == null || (uuid = c869590Y9l.getUuid()) == null) {
            uuid = "";
        }
        String strLJIIIZ = C2256641DUg.LJIIIZ(c873910YQb.LIZ, this.LJII.LJIIJ);
        String strLJFF = C2256641DUg.LJFF(c873910YQb.LIZ);
        String strLJIIIIZZ = C2256641DUg.LJIIIIZZ(c873910YQb.LIZ);
        String strLJIIJ = C2256641DUg.LJIIJ(c873910YQb.LIZ);
        String strLJ = C2256641DUg.LJ(c873910YQb.LIZ);
        C869590Y9l c869590Y9l2 = c873910YQb.LIZ;
        if (c869590Y9l2 != null) {
            localCache = c869590Y9l2.getLocalCache(180003);
        } else {
            localCache = null;
        }
        if (localCache instanceof String) {
            str = (String) localCache;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            abstractC1157700gESRemove = C1DUX.LJ.remove(str);
        } else {
            abstractC1157700gESRemove = null;
        }
        if (abstractC1157700gESRemove instanceof C1157690gER) {
            c1157690gER = (C1157690gER) abstractC1157700gESRemove;
        } else {
            c1157690gER = null;
        }
        if (c1157690gER != null && c869590Y9l2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preupload hit, skip publish msg=");
            sbLIZ.append(c869590Y9l2.getUuid());
            C0YS1.LIZJ("PublishVideoStep", C2188811AlT.LIZIZ(sbLIZ));
            this.LJIIIIZZ.LIZJ.yc(this.LJI.LIZ(), c869590Y9l2, this.LIZJ, new C2256911DVh(c1157690gER.LIZ.LIZ), new C09KS<C2256911DVh>() { // from class: X.1DVg
                @Override // X.C09KS
                public final void Uj(C0OPV c0opv) {
                }

                @Override // X.C09KS
                public final void Z3(C912060ZqG c912060ZqG) {
                }

                @Override // X.C09KS
                public final void m4(String str2) {
                }

                @Override // X.C09KS
                public final void onProgress(int i) {
                }

                @Override // X.C09KS
                public final void rf(C1898507c7 c1898507c7) {
                }

                @Override // X.C09KS
                public final /* bridge */ /* synthetic */ void l1(C09KK c09kk) {
                }
            }, C2256701DUm.LIZ(this.LJII, null, c869590Y9l2.getUuid(), true, 1663), new AwS614S0100000_35(this, 154));
            return C873780YPo.LIZ;
        }
        if (!this.LIZLLL) {
            C2256651DUh c2256651DUh = (C2256651DUh) MediaUploadPerformanceMonitor.LIZIZ.LIZ(uuid);
            c2256651DUh.LIZIZ(c18zl);
            c2256651DUh.LJJI(strLJIIIZ);
            c2256651DUh.LJIL(strLJFF);
            c2256651DUh.LJJ(strLJIIIIZZ);
            c2256651DUh.LJJIFFI(strLJIIJ);
            c2256651DUh.LJIJJ(strLJ);
            iMediaPublishManager.LIZLLL(uuid, this.LIZJ, false, false, this.LJ);
            String str2 = this.LJ.get("pre_stage_track_uuid");
            if (str2 != null && str2.length() > 0) {
                if (uuid.length() > 0) {
                    C1DUV.LIZ(str2).LIZ(uuid);
                }
                C1DUV.LIZ(str2).LIZIZ();
            }
        } else {
            BaseShortVideoContext baseShortVideoContext = this.LJFF;
            if (baseShortVideoContext != null) {
                C2256651DUh c2256651DUh2 = (C2256651DUh) MediaUploadPerformanceMonitor.LIZIZ.LIZ(baseShortVideoContext.getCreationId());
                c2256651DUh2.LIZIZ(c18zl);
                c2256651DUh2.LJJI(strLJIIIZ);
                c2256651DUh2.LJIL(strLJFF);
                c2256651DUh2.LJJ(strLJIIIIZZ);
                c2256651DUh2.LJJIFFI(strLJIIJ);
                c2256651DUh2.LJIJJ(strLJ);
                new DMPath(this.LJFF.getCreationId()).genCreativeMsgResourceDirPath(uuid, true);
                iMediaPublishManager.LJIIIIZZ(uuid, this.LJ, this.LJFF, this.LIZJ.LJIJI);
            } else {
                C0YS1.LIZ("PublishVideoStep", "invalid publish data");
                return C873780YPo.LIZ;
            }
        }
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        iMediaPublishManager.LIZIZ(new C09KS<C2256911DVh>() { // from class: X.1DUk
            @Override // X.C09KS
            public final void Z3(C912060ZqG c912060ZqG) {
            }

            @Override // X.C09KS
            public final void onProgress(int i) {
            }

            public final void LIZ(String str3) {
                C2256631DUf c2256631DUf = this.LL;
                InterfaceC1631630sYr<C0Y3I, C869590Y9l, C09KS<C2256911DVh>, C2256701DUm, Unit> interfaceC1631630sYr = c2256631DUf.LJIIIIZZ.LIZLLL;
                C0Y3I c0y3iLIZ = c2256631DUf.LJI.LIZ();
                C869590Y9l c869590Y9l3 = c873910YQb.LIZ;
                if (c869590Y9l3 == null) {
                    InterfaceC20236714Gf<InterfaceC873770YPn> interfaceC20236714Gf = c2252611DEt;
                    if (interfaceC20236714Gf.isActive()) {
                        C873780YPo c873780YPo = C873780YPo.LIZ;
                        C189200o6.m2constructorimpl(c873780YPo);
                        interfaceC20236714Gf.resumeWith(c873780YPo);
                        return;
                    }
                    return;
                }
                interfaceC1631630sYr.invoke(c0y3iLIZ, c869590Y9l3, this, C2256701DUm.LIZ(this.LL.LJII, null, c869590Y9l3.getUuid(), false, 1919));
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<InterfaceC873770YPn> interfaceC20236714Gf2 = c2252611DEt;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("video upload failed: ");
                    sbLIZ2.append(str3);
                    C0YPZ c0ypz = new C0YPZ(new C0YPY(-1053, C2188811AlT.LIZIZ(sbLIZ2), null, null));
                    C189200o6.m2constructorimpl(c0ypz);
                    interfaceC20236714Gf2.resumeWith(c0ypz);
                }
            }

            @Override // X.C09KS
            public final void Uj(C0OPV c0opv) {
                C2256631DUf c2256631DUf = this.LL;
                InterfaceC1685420txc<C0Y3I, C869590Y9l, C0OPV, C1DUR, Function1<? super C1DUR, Unit>, Unit> interfaceC1685420txc = c2256631DUf.LJIIIIZZ.LIZIZ;
                C0Y3I c0y3iLIZ = c2256631DUf.LJI.LIZ();
                C869590Y9l c869590Y9l3 = c873910YQb.LIZ;
                if (c869590Y9l3 == null) {
                    return;
                }
                C2256631DUf c2256631DUf2 = this.LL;
                interfaceC1685420txc.invoke(c0y3iLIZ, c869590Y9l3, c0opv, c2256631DUf2.LIZJ, new AwS614S0100000_35(c2256631DUf2, 156));
            }

            @Override // X.C09KS
            public final void l1(C09KK c09kk) {
                C2256631DUf c2256631DUf = this.LL;
                InterfaceC2280171EMt<C0Y3I, C869590Y9l, C1DUR, C2256911DVh, C09KS<C2256911DVh>, C2256701DUm, Function1<? super C1DUR, Unit>, Unit> interfaceC2280171EMt = c2256631DUf.LJIIIIZZ.LIZJ;
                C0Y3I c0y3iLIZ = c2256631DUf.LJI.LIZ();
                C869590Y9l c869590Y9l3 = c873910YQb.LIZ;
                if (c869590Y9l3 == null) {
                    InterfaceC20236714Gf<InterfaceC873770YPn> interfaceC20236714Gf = c2252611DEt;
                    if (interfaceC20236714Gf.isActive()) {
                        C873780YPo c873780YPo = C873780YPo.LIZ;
                        C189200o6.m2constructorimpl(c873780YPo);
                        interfaceC20236714Gf.resumeWith(c873780YPo);
                        return;
                    }
                    return;
                }
                C2256631DUf c2256631DUf2 = this.LL;
                interfaceC2280171EMt.yc(c0y3iLIZ, c869590Y9l3, c2256631DUf2.LIZJ, c09kk, this, C2256701DUm.LIZ(c2256631DUf2.LJII, null, c869590Y9l3.getUuid(), false, 1919), new AwS614S0100000_35(this.LL, 157));
                if (!c2252611DEt.isActive()) {
                    return;
                }
                InterfaceC20236714Gf<InterfaceC873770YPn> interfaceC20236714Gf2 = c2252611DEt;
                C873780YPo c873780YPo2 = C873780YPo.LIZ;
                C189200o6.m2constructorimpl(c873780YPo2);
                interfaceC20236714Gf2.resumeWith(c873780YPo2);
            }

            @Override // X.C09KS
            public final void m4(String str3) {
                C2256631DUf c2256631DUf = this.LL;
                InterfaceC1685420txc<C0Y3I, C869590Y9l, String, C1DUR, Function1<? super C1DUR, Unit>, Unit> interfaceC1685420txc = c2256631DUf.LJIIIIZZ.LIZ;
                C0Y3I c0y3iLIZ = c2256631DUf.LJI.LIZ();
                C869590Y9l c869590Y9l3 = c873910YQb.LIZ;
                if (c869590Y9l3 == null) {
                    return;
                }
                C2256631DUf c2256631DUf2 = this.LL;
                interfaceC1685420txc.invoke(c0y3iLIZ, c869590Y9l3, str3, c2256631DUf2.LIZJ, new AwS614S0100000_35(c2256631DUf2, 155));
            }

            @Override // X.C09KS
            public final void rf(C1898507c7 c1898507c7) {
                LIZ(c1898507c7.LIZ);
            }
        }, uuid);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public C2256631DUf(String str, C1DUR c1dur, boolean z, Map<String, String> map, BaseShortVideoContext baseShortVideoContext, C0Y3I c0y3i, C2256701DUm c2256701DUm, C1DV3 c1dv3) {
        super("camera-publish-video-with-upload");
        this.LIZIZ = str;
        this.LIZJ = c1dur;
        this.LIZLLL = z;
        this.LJ = map;
        this.LJFF = baseShortVideoContext;
        this.LJI = c0y3i;
        this.LJII = c2256701DUm;
        this.LJIIIIZZ = c1dv3;
    }
}
