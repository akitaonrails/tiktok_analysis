package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC569060MTo {
    void LIZ(Activity activity, Intent intent, boolean z, boolean z2);

    void LIZIZ(Activity activity, Intent intent);

    void LIZJ(Context context, Bundle bundle, int i, int i2);

    void LIZLLL(Context context, Intent intent);

    void LJ(C19EG c19eg, MediaModel mediaModel, CreativeInfo creativeInfo, Effect effect, ShortVideoCommonParams shortVideoCommonParams);

    void LJFF(Context context, Intent intent);

    void LJI(Activity activity, Intent intent);

    boolean LJII(Context context, Intent intent);

    void LJIIIIZZ(Activity activity, StitchParams stitchParams, CreativeInfo creativeInfo);

    void LJIIIZ(Activity activity, Bundle bundle, int i, int i2);

    void LJIIJ(Context context, Intent intent);

    void LJIIJJI(Activity activity, Intent intent);

    void LJIIL(Activity activity, Intent intent);

    void LJIILIIL(Context context, Intent intent);

    void LJIILJJIL(Context context, int i, Intent intent);

    void LJIILL(Activity activity, Intent intent, CreativeInfo creativeInfo);

    void LJIILLIIL(Activity activity, Intent intent);

    void LJIIZILJ(Context context, Intent intent, boolean z);

    void LJIJ(Context context, Intent intent, Function0 function0);

    void LJIJI(Context context, Intent intent);

    void LJIJJ(Context context, Intent intent, Function0 function0);

    Intent LJIJJLI(Activity activity, Bundle bundle);

    void LJIL(Context context, Intent intent);

    void LJJ(Activity activity, Intent intent, Integer num);

    void LJJI(Activity activity, int i, Intent intent);

    void LJJIFFI(Activity activity, Intent intent);
}
