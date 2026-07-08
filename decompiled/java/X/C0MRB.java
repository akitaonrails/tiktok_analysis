package X;

import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MRB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRB extends Scene implements InterfaceC523020KfE {
    public SmartImageView LLJI;
    public Function0<Unit> LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public VideoPublishEditModel LLJILJILJ;
    public List<ForwardMedia> LLJILLL;

    public C0MRB() {
        setTheme(R.style.z4);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        Context contextRequireSceneContext = requireSceneContext();
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 103), requireViewById(R.id.lc0));
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.zzh);
        C1305840k5O c1305840k5O = C1305840k5O.LIZ;
        c1305840k5O.getClass();
        int i2 = C1697630uHJ.LIZ;
        int i3 = 102;
        if (i2 != 2) {
            if (i2 != 3) {
                i = 102;
            } else {
                i = 42;
            }
        } else {
            i = 32;
        }
        tuxTextView.setTuxFont(i);
        C786410Ut5.h9(tuxTextView, new ACListenerS143S0100000_8(this, 104));
        TuxTextView tuxTextView2 = (TuxTextView) requireViewById(R.id.z9c);
        c1305840k5O.getClass();
        int i4 = C1697630uHJ.LIZ;
        if (i4 != 2) {
            if (i4 == 3) {
                i3 = 42;
            }
        } else {
            i3 = 32;
        }
        tuxTextView2.setTuxFont(i3);
        C786410Ut5.h9(tuxTextView2, new ACListenerS143S0100000_8(this, 105));
        ((TuxTextView) requireViewById(R.id.tv_title)).setTuxFont(C0MRC.LIZIZ(contextRequireSceneContext));
        TuxTextView tuxTextView3 = (TuxTextView) requireViewById(R.id.zf0);
        tuxTextView3.setTuxFont(C0MRC.LIZ(contextRequireSceneContext));
        VideoPublishEditModel videoPublishEditModel = this.LLJILJILJ;
        if (videoPublishEditModel != null) {
            C0MRA.LIZ(tuxTextView3, this, videoPublishEditModel, true, this.LLJILLL);
        }
        this.LLJI = (SmartImageView) requireViewById(R.id.lqq);
        SmartImageView smartImageView = this.LLJI;
        if (smartImageView != null) {
            HandlerHook.viewPost(smartImageView, new ARunnableS108S0100000_8(this, 85));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C0MQO.LIZ()) {
            i = R.layout.ekn;
        } else {
            i = R.layout.ekm;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
