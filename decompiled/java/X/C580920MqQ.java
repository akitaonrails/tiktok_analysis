package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580920MqQ implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
        }
    }

    public C580920MqQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C580920MqQ c580920MqQ, CompoundButton compoundButton, boolean z) {
        ((Function1) c580920MqQ.l0).invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onCheckedChanged$1(X.C580920MqQ r4, android.widget.CompoundButton r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580920MqQ.onCheckedChanged$1(X.0MqQ, android.widget.CompoundButton, boolean):void");
    }

    public static final void onCheckedChanged$2(C580920MqQ c580920MqQ, CompoundButton compoundButton, boolean z) {
        VideoImageMixedController videoImageMixedController = (VideoImageMixedController) c580920MqQ.l0;
        videoImageMixedController.LLLZL.setValue(Boolean.valueOf(videoImageMixedController.LJJIIZ()));
    }
}
