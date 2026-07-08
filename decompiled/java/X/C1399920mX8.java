package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import java.io.Serializable;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399920mX8 extends AbstractC813200VvC {
    public final Intent LL;

    public C1399920mX8(Intent intent) {
        this.LL = intent;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        AVMusic aVMusic;
        Aweme aweme;
        UrlModel urlModel;
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        if (fragment instanceof StickerPropDetailFragment) {
            StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) fragment;
            stickerPropDetailFragment.LLLLZLL = LIZ(this.LL, "aweme_id");
            stickerPropDetailFragment.LLLLZLLIL = LIZ(this.LL, "tt_template_id");
            stickerPropDetailFragment.LLLLZLLLI = LIZ(this.LL, "tt_template_type");
            stickerPropDetailFragment.LLLLZIL = LIZ(this.LL, "extra_log_pb");
            stickerPropDetailFragment.LLILLJJLI = LIZ(this.LL, "extra_sticker_from");
            Serializable serializableExtra = this.LL.getSerializableExtra("sticker_music");
            if (serializableExtra instanceof AVMusic) {
                aVMusic = (AVMusic) serializableExtra;
            } else {
                aVMusic = null;
            }
            stickerPropDetailFragment.LLLZLL = aVMusic;
            stickerPropDetailFragment.LLLZLZ = this.LL.getSerializableExtra("music_model");
            stickerPropDetailFragment.LLZZJLIL = this.LL.getStringArrayListExtra("extra_stickers");
            this.LL.getIntExtra("media_type", 0);
            stickerPropDetailFragment.LLLLLLJ = 0;
            stickerPropDetailFragment.LLZIL = this.LL.getIntExtra("extra_video_length", 0);
            stickerPropDetailFragment.LLZILL = LIZ(this.LL, "extra_previous_page");
            String strLIZ = LIZ(this.LL, "shoot_enter_from");
            if (C123100dR.LIZ(strLIZ)) {
                stickerPropDetailFragment.LLLZZ = strLIZ;
            }
            stickerPropDetailFragment.LLLZZIL = LIZ(this.LL, "from_banner_id");
            stickerPropDetailFragment.LLZ = this.LL.getIntExtra("is_bundled", 0);
            stickerPropDetailFragment.LLZL = this.LL.getBooleanExtra("enter_record_from_feed", false);
            Serializable serializableExtra2 = this.LL.getSerializableExtra("extra_related_item");
            if (serializableExtra2 instanceof Aweme) {
                aweme = (Aweme) serializableExtra2;
            } else {
                aweme = null;
            }
            stickerPropDetailFragment.LLLLLZIL = aweme;
            String strLIZ2 = LIZ(this.LL, "extra_owner_id");
            String str = "";
            if (strLIZ2 == null) {
                strLIZ2 = "";
            }
            stickerPropDetailFragment.LLLLLZL = strLIZ2;
            Boolean boolValueOf = Boolean.valueOf(this.LL.getBooleanExtra("extra_enter_edp_from_video_feed", false));
            stickerPropDetailFragment.LLLLZ = boolValueOf;
            C116F.LLJILJIL = boolValueOf;
            Serializable serializableExtra3 = this.LL.getSerializableExtra("extra_url_icon");
            if (serializableExtra3 instanceof UrlModel) {
                urlModel = (UrlModel) serializableExtra3;
            } else {
                urlModel = null;
            }
            stickerPropDetailFragment.LLLLZI = urlModel;
            String strLIZ3 = LIZ(this.LL, "extra_edit_effect_uid");
            if (strLIZ3 == null) {
                strLIZ3 = "";
            }
            stickerPropDetailFragment.LLLZ = strLIZ3;
            String strLIZ4 = LIZ(this.LL, "prop_page_enter_from");
            if (strLIZ4 == null || !(!a0.LJJJIL(strLIZ4))) {
                strLIZ4 = LIZ(this.LL, "enter_from");
                if (strLIZ4 == null) {
                    strLIZ4 = "";
                }
                this.LL.putExtra("prop_page_enter_from", strLIZ4);
            }
            stickerPropDetailFragment.l = strLIZ4;
            String strLIZ5 = LIZ(this.LL, "prop_page_enter_method");
            if (strLIZ5 == null) {
                strLIZ5 = "";
            }
            stickerPropDetailFragment.m = strLIZ5;
            stickerPropDetailFragment.n = this.LL.getIntExtra("is_favourite_prop", 0);
            List<String> list = stickerPropDetailFragment.LLZZJLIL;
            if (list != null && (!list.isEmpty())) {
                stickerPropDetailFragment.LLILZ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
            }
            String strLIZ6 = LIZ(this.LL, "anchor_type");
            if (strLIZ6 != null) {
                stickerPropDetailFragment.LLLZI = strLIZ6;
            }
            String strLIZ7 = LIZ(this.LL, "sticker_id");
            if (strLIZ7 == null) {
                strLIZ7 = "";
            }
            stickerPropDetailFragment.mStickerIds = strLIZ7;
            C116F.LLJIJIL = stickerPropDetailFragment.LLLLLLJ;
            stickerPropDetailFragment.mHasRecordHideAnim = false;
            String strLIZ8 = LIZ(this.LL, "voice_conversion_effect_id");
            if (strLIZ8 == null) {
                strLIZ8 = "";
            }
            stickerPropDetailFragment.LLLZIIL = strLIZ8;
            String strLIZ9 = LIZ(this.LL, "voice_conversion_effect_name");
            if (strLIZ9 != null) {
                str = strLIZ9;
            }
            stickerPropDetailFragment.LLLZIL = str;
        }
    }
}
