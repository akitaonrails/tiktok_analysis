package com.bytedance.android.live.moderator;

import X.C006A;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.android.livesdk.moderator.ModeratorListFragment;
import com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.moderator.NewModeratorListSheet;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;

/* JADX INFO: loaded from: classes13.dex */
public interface IModeratorService extends C006A {
    ModeratorHostIModeratorListFragment Qp0();

    ModeratorHostIModerateDialog SJ2();

    ModeratorPermissionEditFragment kk2();

    ModeratorListFragmentSheet lH1();

    ModeratorPermissionEditFragmentSheet mr1();

    AddModeratorFragment wN1(String str);

    NewModeratorListSheet wj2(String str);

    ModeratorListFragment zb2(String str);
}
