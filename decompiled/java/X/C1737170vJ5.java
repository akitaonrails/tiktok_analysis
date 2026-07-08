package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectcreator.models.AigcParams;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.UUID;

/* JADX INFO: renamed from: X.0vJ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737170vJ5 {
    public static final /* synthetic */ int LJIJJLI = 0;
    public Context LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public CKEDraftInfo LJIIIIZZ;
    public C1636590sgr LJIIIZ;
    public Uri LJIILIIL;
    public String LJII = "";
    public String LJIIJ = CardStruct.IStatusCode.DEFAULT;
    public String LJIIJJI = "";
    public String LJIIL = "";
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public String LJIIZILJ = "";
    public String LJIJ = CardStruct.IStatusCode.DEFAULT;
    public String LJIJI = CardStruct.IStatusCode.DEFAULT;
    public AigcParams LJIJJ = new AigcParams(0);

    public final C339790DTt LIZ() {
        Context context = this.LIZ;
        if (context == null) {
            return null;
        }
        String string = this.LJ;
        if (string == null || string.length() <= 0) {
            string = UUID.randomUUID().toString();
        }
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        String str2 = this.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LIZLLL;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LJFF;
        if (str4 == null || str4.length() == 0 || str4 == null) {
            str4 = str;
        }
        String str5 = this.LJI;
        return new C339790DTt(context, str, str4, str2, str3, string, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, str5 != null ? str5 : "", this.LJIILL, this.LJIILJJIL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ);
    }

    public final void LIZIZ(String str) {
        this.LJIJJ = AigcParams.LIZ(this.LJIJJ, 0, null, null, str, null, 23);
    }

    public final void LIZJ(String str) {
        try {
            this.LJIJJ = AigcParams.LIZ(this.LJIJJ, CastIntegerProtector.parseInt(str), null, null, null, null, 30);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        this.LJIILIIL = uri;
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ame_local_draft_id")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
            CKEDraftInfo cKEDraftInfo = this.LJIIIIZZ;
            if (cKEDraftInfo == null) {
                cKEDraftInfo = new CKEDraftInfo(null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0, null, null, null, null, null, null, null, null, 33554431, null);
            }
            this.LJIIIIZZ = cKEDraftInfo.copy(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, cKEDraftInfo.draftPath, cKEDraftInfo.effectPath, cKEDraftInfo.effectId, cKEDraftInfo.defaultIconPath, cKEDraftInfo.defaultName, cKEDraftInfo.iconPath, cKEDraftInfo.name, cKEDraftInfo.createTime, cKEDraftInfo.updateTime, cKEDraftInfo.modelId, cKEDraftInfo.author, cKEDraftInfo.versionCode, cKEDraftInfo.platform, cKEDraftInfo.effectHint, cKEDraftInfo.templateHash, cKEDraftInfo.iconEdit, cKEDraftInfo.app, cKEDraftInfo.isAutoGenIcon, cKEDraftInfo.iconAssetId, cKEDraftInfo.isIconEffectApplied, cKEDraftInfo.iconSelectTypeValue, cKEDraftInfo.originIconPath, cKEDraftInfo.iconInfo, cKEDraftInfo.aigcInfo);
        }
    }
}
