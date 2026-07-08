package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0LZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LZ8 extends C19A3 {
    public static final /* synthetic */ int LLJILLL = 0;

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "leave AIGCGenerationDraftCompatGroupScene");
        C560380LyO c560380LyO = C560380LyO.LIZ;
        if (C560380LyO.LJIIJ) {
            c560380LyO.getClass();
        } else {
            c560380LyO.getClass();
            C560380LyO.LJIIIIZZ("save_draft");
            C560380LyO.LIZ();
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        CreativeInfo creativeInfo;
        String string;
        String string2;
        long j;
        int i;
        String string3;
        String string4;
        AIGCOfflineModel aIGCOfflineModel;
        String creationId;
        String str;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            creativeInfo = (CreativeInfo) bundle2.getParcelable("creative_info");
        } else {
            creativeInfo = null;
        }
        if (!(creativeInfo instanceof CreativeInfo)) {
            creativeInfo = null;
        }
        Bundle bundle3 = this.mArguments;
        String str2 = "";
        if (bundle3 == null || (string = bundle3.getString("task_id")) == null) {
            string = "";
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || (string2 = bundle4.getString("task_status")) == null) {
            string2 = "";
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            j = bundle5.getLong("elapsed_waiting_time");
        } else {
            j = 0;
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            i = bundle6.getInt("estimated_waiting_time");
        } else {
            i = 0;
        }
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            string3 = bundle7.getString("req_key");
        } else {
            string3 = null;
        }
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            string4 = bundle8.getString("req_json");
        } else {
            string4 = null;
        }
        Bundle bundle9 = this.mArguments;
        if (bundle9 != null) {
            aIGCOfflineModel = (AIGCOfflineModel) bundle9.getParcelable("aigc_offline_model");
        } else {
            aIGCOfflineModel = null;
        }
        if (!(aIGCOfflineModel instanceof AIGCOfflineModel)) {
            aIGCOfflineModel = null;
        }
        if (creativeInfo == null) {
            C1AF0.LJ(new IllegalArgumentException("creativeInfo is empty"));
        }
        if (string.length() == 0) {
            C1AF0.LJ(new IllegalArgumentException("taskId is empty"));
        }
        if (string2.length() == 0) {
            C1AF0.LJ(new IllegalArgumentException("taskStatus is empty"));
        }
        if (i == 0) {
            C1AF0.LJ(new IllegalArgumentException("estimatedWaitingTime is empty"));
        }
        if (string3 == null) {
            C1AF0.LJ(new IllegalArgumentException("reqKey is empty"));
        }
        if (string4 == null) {
            C1AF0.LJ(new IllegalArgumentException("reqJson is empty"));
        }
        if (aIGCOfflineModel == null) {
            C1AF0.LJ(new IllegalArgumentException("aigcOfflineModel is empty"));
        }
        C1664590tQ1.LIZLLL(this, null, false, AFwS239S0000000_8.get$arr$(226), 3);
        C1664600tQ2.LIZ(this, null, new C0LZ7(this, string, j, aIGCOfflineModel, creativeInfo));
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "init AIGCGenerationDraftCompatGroupScene");
        C560380LyO c560380LyO = C560380LyO.LIZ;
        Lifecycle lifecycle = ((C19FO) requireActivity()).getLifecycle();
        c560380LyO.getClass();
        C560380LyO.LIZIZ(lifecycle, true);
        if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
            creationId = "";
        }
        if (aIGCOfflineModel != null && (str = aIGCOfflineModel.shootWay) != null) {
            str2 = str;
        }
        C560380LyO.LJIILJJIL(creationId, str2, true);
        C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.OTHERS, System.currentTimeMillis()));
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ems, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
