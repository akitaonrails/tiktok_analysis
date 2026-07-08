package com.bytedance.android.live.adminsetting;

import X.C006A;
import X.C20484615Do;
import X.C745220TLc;
import X.EnumC748580TYa;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter;
import com.bytedance.android.livesdk.adminsetting.LiveBlockKeywordsFullScreenFragment;
import com.bytedance.android.livesdk.adminsetting.LiveBroadcastEndAdminSettingDialog;
import com.bytedance.android.livesdk.adminsetting.LiveCommentAddBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsOptFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragment;
import com.bytedance.android.livesdk.adminsetting.MuteConfirmDialogFragment;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public interface IAdminSettingService extends C006A {
    LiveCommentBlockKeywordsOptFragmentSheet Bv1();

    LiveMuteDurationSettingFragment EU1(View.OnClickListener onClickListener, Function1 function1);

    LiveCommentSettingFragment FN0(AwS591S0100000_12 awS591S0100000_12);

    void Ft0();

    LiveAdminSettingDialog Fv2(EnumC748580TYa enumC748580TYa, String str);

    LiveCommentBlockKeywordsFragment GL2();

    Class<? extends LiveSheetFragment> Lc0();

    void M22(long j, String str, FragmentManager fragmentManager, int i, Long l);

    LiveCommentAddBlockKeywordsOptFragment Ot2();

    LiveAdminSettingGuideAdapter PE0(Fragment fragment, DataChannel dataChannel, C20484615Do c20484615Do, LifecycleOwner lifecycleOwner);

    LiveFilterCommentSettingFragmentNew Qj2(String str);

    LiveCommentBlockKeywordsOptFragment Rz2();

    void VI2(String str, C745220TLc c745220TLc, String str2, long j, Long l);

    LiveBlockKeywordsFullScreenFragment YT1();

    CommunityFlaggedManageSheetFragment eu2();

    Class<? extends LiveSheetFragment> iM();

    void jI2(FragmentManager fragmentManager, List list);

    MuteConfirmDialogFragment n40(Function2 function2);

    LiveBroadcastEndAdminSettingDialog n60(EnumC748580TYa enumC748580TYa);

    LiveCommercialContentToggleFragmentSheet p80(boolean z, boolean z2, LiveMode liveMode, boolean z3, boolean z4, boolean z5);

    LiveCommentSettingFragmentSheet pn1(String str, Function1 function1);

    void sT(FragmentManager fragmentManager, long j, int i);

    LiveAdminSettingDialog vU1(EnumC748580TYa enumC748580TYa);

    LiveAdminSettingDialog xu2(boolean z);
}
