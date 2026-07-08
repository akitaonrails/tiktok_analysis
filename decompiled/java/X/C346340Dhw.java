package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.music.HighlightChooseMusicDialogFragment;
import java.util.Map;
import kotlin.jvm.internal.AwS19S0010000_4;

/* JADX INFO: renamed from: X.0Dhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346340Dhw implements CompoundButton.OnCheckedChangeListener {
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
        }
    }

    public C346340Dhw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C346340Dhw c346340Dhw, CompoundButton compoundButton, boolean z) {
        ((HighlightChooseMusicDialogFragment) c346340Dhw.l0).MR().setState(new AwS19S0010000_4(z, 5));
        C344080DeI c344080DeI = C344080DeI.LIZ;
        Map<String, String> map = ((HighlightChooseMusicDialogFragment) c346340Dhw.l0).LLILLL;
        c344080DeI.getClass();
        C344080DeI.LIZ("original sound", null, null, map);
    }

    public static final void onCheckedChanged$1(C346340Dhw c346340Dhw, CompoundButton compoundButton, boolean z) {
        if (z) {
            C20684815ws.onEventV3("remove_linked_account_toggle_on");
        } else {
            C20684815ws.onEventV3("remove_linked_account_toggle_off");
        }
        ((C013C) c346340Dhw.l0).element = z;
    }
}
