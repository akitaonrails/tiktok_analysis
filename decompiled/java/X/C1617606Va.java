package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617606Va extends LinearLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final C197039127h LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;

    public final IIMSocialAvatarService getImAiMojiService() {
        return (IIMSocialAvatarService) this.LLILZ.getValue();
    }

    public final ISocialAvatarService getSocialAvatarService() {
        return (ISocialAvatarService) this.LLILZIL.getValue();
    }

    public C1617606Va(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1124));
        this.LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1125));
        LinearLayout.inflate(context, R.layout.cnw, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setOrientation(1);
        setGravity(17);
        this.LL = (SmartImageView) findViewById(R.id.aui);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.aue);
        this.LLILLL = (C197039127h) findViewById(R.id.auf);
    }
}
