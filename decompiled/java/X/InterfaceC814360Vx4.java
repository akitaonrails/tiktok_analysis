package X;

import android.os.IInterface;
import com.heytap.mcs.liquid.model.ActionResult;

/* JADX INFO: renamed from: X.0Vx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC814360Vx4 extends IInterface {
    void onClick(String str, int i);

    void onDismiss(String str);

    void onFailed(String str, int i, int i2);

    ActionResult onPauseClick(String str);

    ActionResult onResumeClick(String str);

    void onShow(String str, int i);
}
