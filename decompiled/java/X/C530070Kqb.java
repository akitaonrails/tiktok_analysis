package X;

import Y.ACallableS415S0100000_8;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530070Kqb implements InterfaceC528880Kog {
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(12));
    public boolean LIZJ = true;
    public String LIZLLL = "";
    public final boolean LJ = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_upload_format_ext", true, false);

    public C530070Kqb(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC528880Kog
    public final void setEnterFrom(String str) {
        this.LIZLLL = str;
    }

    public static final void LIZJ(final C530070Kqb c530070Kqb, MediaModel mediaModel, final Function1<? super C529210KpD, Unit> function1, final long j, final String str, final Function1<? super C529210KpD, Unit> function12) {
        C15O7.LIZIZ(new ACallableS415S0100000_8(mediaModel, 1), (Executor) c530070Kqb.LIZIZ.getValue(), null).LJ(new InterfaceC2385309Wh() { // from class: X.0Kqd
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("LocalVideoLegalChecker@3c01.checkVideoLegal$checkWithVEIsCanImport$2");
                Integer num = (Integer) c15o7.LJIIL();
                if (num != null && num.intValue() == 0) {
                    Function1<C529210KpD, Unit> function13 = function1;
                    c530070Kqb.getClass();
                    function13.invoke(new C529210KpD(0, "LocalVideoLegalChecker", System.currentTimeMillis() - j, str, "", true));
                } else {
                    Function1<C529210KpD, Unit> function14 = function12;
                    c530070Kqb.getClass();
                    function14.invoke(new C529210KpD(((Number) c15o7.LJIIL()).intValue(), "LocalVideoLegalChecker", System.currentTimeMillis() - j, str, "", false));
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LocalVideoLegalChecker@3c01.checkVideoLegal$checkWithVEIsCanImport$2");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC528880Kog
    public final void LIZ(final MediaModel mediaModel, final boolean z, final long j, final long j2, final boolean z2, final boolean z3, final boolean z4, final Function1<? super C529210KpD, Unit> function1, final Function1<? super C529210KpD, Unit> function12) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(null, "local_video_legal_checker", true)) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final String strLIZ = C1918707fN.LIZ(mediaModel.fileName);
            if (mediaModel.LJIIL() && mediaModel.onlineVideoUrl != null) {
                LIZIZ(mediaModel, z, j, j2, jCurrentTimeMillis, strLIZ, z3, z4, function1, function12);
                return;
            }
            C2286708xd.LIZIZ(new InterfaceC2286808xe(mediaModel, z, j, j2, jCurrentTimeMillis, strLIZ, z2, z3, z4, function1, function12) { // from class: X.0Kqe
                public final /* synthetic */ MediaModel LIZIZ;
                public final /* synthetic */ boolean LIZJ;
                public final /* synthetic */ long LIZLLL;
                public final /* synthetic */ long LJ;
                public final /* synthetic */ long LJFF;
                public final /* synthetic */ String LJI;
                public final /* synthetic */ boolean LJII;
                public final /* synthetic */ boolean LJIIIIZZ;
                public final /* synthetic */ Function1<C529210KpD, Unit> LJIIIZ;
                public final /* synthetic */ Function1<C529210KpD, Unit> LJIIJ;

                @Override // X.InterfaceC2286808xe
                public final void LIZ(Object obj) {
                    if (!(obj instanceof Boolean)) {
                        obj = null;
                    }
                    if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                        this.LIZ.LIZIZ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
                        return;
                    }
                    Function1<C529210KpD, Unit> function13 = this.LJIIJ;
                    this.LIZ.getClass();
                    function13.invoke(new C529210KpD(-4, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LJFF, this.LJI, "", false));
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LJII = z3;
                    this.LJIIIIZZ = z4;
                    this.LJIIIZ = function1;
                    this.LJIIJ = function12;
                }
            }, mediaModel.LJFF(), C289360BVu.LIZ());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d4, code lost:
    
        if (r1 > 1100) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r36, boolean r37, long r38, long r40, long r42, java.lang.String r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function1 r48) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C530070Kqb.LIZIZ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, boolean, long, long, long, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }
}
