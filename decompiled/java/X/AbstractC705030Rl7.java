package X;

import X.AbstractC704860Rkq;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Rl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC705030Rl7<T extends AbstractC704860Rkq<?>> implements InterfaceC705050Rl9 {
    public final Context LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final ViewGroup LJFF;
    public final View LJI;
    public final C704840Rko LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public VideoItemParams LJIIJJI;
    public T LJIIL;
    public C705340Rlc LJIILIIL;

    public void LJIIL(String str, Function0<Unit> function0) {
    }

    public abstract void LJIIZILJ(T t, Function0<Unit> function0);

    public final C704910Rkv LIZJ() {
        return (C704910Rkv) this.LJIIIIZZ.getValue();
    }

    public final C705060RlA LIZLLL() {
        return (C705060RlA) this.LJIIJ.getValue();
    }

    public final void LJIIJ() {
        this.LJIIIZ.getValue().getClass();
        LJIILLIIL();
    }

    public final void LJIIJJI() {
        this.LJIIIZ.getValue().getClass();
        InterfaceC705050Rl9.LIZ.getClass();
        C705340Rlc c705340Rlc = this.LJIILIIL;
        if (c705340Rlc != null) {
            c705340Rlc.LIZ("exposure_action");
        }
        C705340Rlc c705340Rlc2 = this.LJIILIIL;
        if (c705340Rlc2 != null) {
            c705340Rlc2.LIZIZ("exposure_over_action");
        }
        LIZ("un_select");
    }

    public void LJIILIIL() {
        this.LJIIIZ.getValue().getClass();
        this.LJIILIIL = null;
        this.LJIIL = null;
    }

    public final void LJIILJJIL() {
        Aweme aweme;
        C20653815rs c20653815rs = C20653815rs.LIZ;
        VideoItemParams videoItemParams = this.LJIIJJI;
        C20653815rs.LIZJ(c20653815rs, (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null) ? null : aweme.getAid(), this.LIZJ, "negative");
    }

    public final void LJIILL() {
        Aweme aweme;
        Aweme aweme2;
        C20653815rs c20653815rs = C20653815rs.LIZ;
        VideoItemParams videoItemParams = this.LJIIJJI;
        String requestId = null;
        String aid = (videoItemParams == null || (aweme2 = videoItemParams.getAweme()) == null) ? null : aweme2.getAid();
        String str = this.LIZJ;
        VideoItemParams videoItemParams2 = this.LJIIJJI;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            requestId = aweme.getRequestId();
        }
        c20653815rs.getClass();
        C20653815rs.LIZLLL(aid, str, requestId);
    }

    public final void LJIILLIIL() {
        C705340Rlc c705340Rlc = this.LJIILIIL;
        if (c705340Rlc != null) {
            c705340Rlc.LIZ("exposure_over_action");
        }
        C705340Rlc c705340Rlc2 = this.LJIILIIL;
        if (c705340Rlc2 != null) {
            c705340Rlc2.LIZIZ("exposure_action");
        }
        LIZIZ(null);
    }

    public final void LIZIZ(Function0<Unit> function0) {
        FcpUiTemplate fcpUiTemplate;
        C704840Rko c704840Rko = this.LJII;
        Map<String, Object> linkedHashMap = null;
        if (c704840Rko != null && c704840Rko.LIZJ != null) {
            Function2<? super Map<String, Object>, ? super Function0<Unit>, Unit> function2 = c704840Rko.LIZJ;
            if (function2 != null) {
                T t = this.LJIIL;
                if (t != null && (fcpUiTemplate = t.LIZ) != null) {
                    linkedHashMap = fcpUiTemplate.getFieldsMap();
                }
                if (!C19719512Dh.LJII(linkedHashMap) || linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                function2.invoke(linkedHashMap, new AwS412S0200000_11(this, function0, (Function0<Unit>) 49));
                return;
            }
            return;
        }
        T t2 = this.LJIIL;
        if (t2 == null) {
            return;
        }
        t2.LIZ();
        T t3 = this.LJIIL;
        if (t3 != null && t3.LIZLLL()) {
            LJIIZILJ(t2, function0);
            onShow();
        } else {
            InterfaceC705050Rl9.LIZ.getClass();
            LIZ("invalid_data");
        }
    }

    public final Integer LJFF(Context context, String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tux://color?token=");
            sbLIZ.append(str);
            sbLIZ.append("&from=feed_fcp_standard_template");
            return C2248361CzK.LJ(context, C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("component key: ");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append(", template: ");
            sbLIZ2.append(this.LJ);
            sbLIZ2.append(", load tux color resource: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" failed, exception: ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
            return null;
        }
    }

    public final Integer LJI(Context context, String str) {
        try {
            return C2248361CzK.LJ(context, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("component key: ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", template: ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(", load tux color resource: ");
            sbLIZ.append(str);
            sbLIZ.append(" failed, exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }

    public final C698190Ra5 LJII(Context context, String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tux://icon?token=");
            sbLIZ.append(str);
            sbLIZ.append("&from=feed_fcp_standard_template");
            return C2248361CzK.LJFF(context, C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("component key: ");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append(", template: ");
            sbLIZ2.append(this.LJ);
            sbLIZ2.append(", load tux icon resource: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" failed, exception: ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
            return null;
        }
    }

    public final C698190Ra5 LJIIIIZZ(Context context, String str) {
        try {
            return C2248361CzK.LJFF(context, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("component key: ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", template: ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(", load tux icon resource: ");
            sbLIZ.append(str);
            sbLIZ.append(" failed, exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }

    public void LJIIIZ(VideoItemParams videoItemParams, T t, C705340Rlc c705340Rlc) {
        this.LJIIIZ.getValue().getClass();
        this.LJIILIIL = c705340Rlc;
        this.LJIIJJI = videoItemParams;
        this.LJIIL = t;
        C704840Rko c704840Rko = this.LJII;
        if (c704840Rko != null) {
            c704840Rko.LJ = new AwS555S0100000_11(this, 1341);
        }
        C704840Rko c704840Rko2 = this.LJII;
        if (c704840Rko2 != null) {
            c704840Rko2.LIZIZ = new AwS625S0100000_11(this, 101);
        }
        C704840Rko c704840Rko3 = this.LJII;
        if (c704840Rko3 != null) {
            c704840Rko3.LIZ = new AwS625S0100000_11(this, 102);
        }
        C704840Rko c704840Rko4 = this.LJII;
        if (c704840Rko4 != null) {
            c704840Rko4.LIZLLL = new AwS555S0100000_11(this, 1342);
        }
    }

    public final void LJ(final Uri uri, final int i, final Function1<? super Drawable, Unit> function1, final Function0<Unit> function0, final Function1<? super Throwable, Unit> function12) {
        C1331660kl2.LJI(uri).LJJII(new InterfaceC1331910klR() { // from class: X.0RlF
            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component key: ");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", template: ");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", load dynamic icon resource: ");
                sbLIZ.append(uri);
                sbLIZ.append(" canceled");
                C2188811AlT.LIZIZ(sbLIZ);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                C844470XAv.LIZ.getClass();
                C443530HaJ c443530HaJ = new C443530HaJ(C844470XAv.LIZ().getResources(), bitmap);
                int i2 = i;
                c443530HaJ.setBounds(0, 0, i2, i2);
                c443530HaJ.LIZJ(i2 / 2);
                Function1<Drawable, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(c443530HaJ);
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component key: ");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", template: ");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", load dynamic icon resource: ");
                sbLIZ.append(uri);
                sbLIZ.append(" failed, exception: ");
                sbLIZ.append(th);
                C2188811AlT.LIZIZ(sbLIZ);
                Function1<Throwable, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(th);
                }
            }
        });
    }

    public /* synthetic */ AbstractC705030Rl7(String str, String str2, String str3, View view, C704840Rko c704840Rko, int i) {
        this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, null, (i & 32) != 0 ? null : view, (i & 64) != 0 ? null : c704840Rko);
    }

    public AbstractC705030Rl7(Context context, String str, String str2, String str3, ViewGroup viewGroup, View view, C704840Rko c704840Rko) {
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = viewGroup;
        this.LJI = view;
        this.LJII = c704840Rko;
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(307));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(309));
        this.LJIIJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(308));
    }
}
