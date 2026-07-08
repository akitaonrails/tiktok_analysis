package X;

import Y.ACListenerS120S0200000_17;
import Y.ARunnableS50S0300000_17;
import Y.ATListenerS84S0201000_17;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.EmoteUploadInfo;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS666S0100000_17;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0f8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115580f8W extends AbstractC1115600f8Y<EmoteModel> {
    public final InterfaceC1115480f8M<EmoteModel> LL;
    public final InterfaceC1115630f8b LLILLJJLI;
    public final String LLILLL;
    public final Function0<Boolean> LLILZ;
    public final C19R6 LLILZIL;
    public final FrameLayout LLILZLL;
    public final C1324720kZq LLIZ;
    public final ConstraintLayout LLIZLLLIL;
    public boolean LLJ;
    public final BPEAHandler LLJI;
    public final C01GW LLJIJIL;

    @Override // X.AbstractC1115600f8Y
    public final void I5(int i, Object obj) {
        List<String> listLIZ;
        User user;
        ImageModel avatarThumb;
        User user2;
        EmoteModel emoteModel = (EmoteModel) obj;
        EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel = (EmotePerformanceTrackerViewModel) this.LLJIJIL.getValue();
        if (emotePerformanceTrackerViewModel != null) {
            emotePerformanceTrackerViewModel.vQ2(emoteModel);
        }
        if (emoteModel.image != null) {
            Drawable drawable = emoteModel.emoteResource;
            if (drawable != null) {
                this.LLILZIL.setImageDrawable(drawable);
                L5(emoteModel, "", 2);
            } else {
                C0KBS c0kbs = C0KBS.LIZ;
                C0KBS.LJII(emoteModel, this.itemView.getContext().getResources(), new AwS666S0100000_17(this, 6));
            }
        }
        if (emoteModel.emoteUploadInfo != null && this.LLILZ.invoke().booleanValue()) {
            C500260Jjc.LJLJLJ(this.LLIZLLLIL, true);
            EmoteUploadInfo emoteUploadInfo = emoteModel.emoteUploadInfo;
            if (emoteUploadInfo == null || (user2 = emoteUploadInfo.userInfo) == null || user2.getSecret() != 1) {
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                EmoteUploadInfo emoteUploadInfo2 = emoteModel.emoteUploadInfo;
                if (emoteUploadInfo2 != null && (user = emoteUploadInfo2.userInfo) != null && (avatarThumb = user.getAvatarThumb()) != null) {
                    listLIZ = C842240X2g.LIZ(avatarThumb);
                } else {
                    listLIZ = null;
                }
                C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
                c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
                c1324610kZfLIZJ.LJJI(this.LLIZ);
            }
        } else {
            C500260Jjc.LJLJLJ(this.LLIZLLLIL, false);
        }
        if (emoteModel.shine && !this.LLJ) {
            C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS50S0300000_17(new C118300cf(), this, emoteModel, 18));
        }
        if (!emoteModel.readOnly && emoteModel.inputLimited) {
            this.LLILZIL.setColorFilter(ColorProtector.parseColor("#57ffffff"), PorterDuff.Mode.SRC_ATOP);
        } else {
            this.LLILZIL.setColorFilter((ColorFilter) null);
        }
        C786410Ut5.I7(new ACListenerS120S0200000_17(this, emoteModel, 31), this.itemView);
        this.itemView.setOnTouchListener(new ATListenerS84S0201000_17(emoteModel, this, i, 0));
    }

    public final void L5(EmoteModel emoteModel, String str, int i) {
        List<EmoteModel> list;
        boolean z;
        String strLJJLJLI;
        int i2;
        ImageModel imageModel;
        List urls;
        String str2;
        EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel = (EmotePerformanceTrackerViewModel) this.LLJIJIL.getValue();
        if (emotePerformanceTrackerViewModel != null && (!((ArrayList) emotePerformanceTrackerViewModel.LLJ).isEmpty()) && emotePerformanceTrackerViewModel != null) {
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (emotePerformanceTrackerViewModel.wQ2(emoteModel, z)) {
                String str3 = "";
                if (emoteModel == null || (imageModel = emoteModel.image) == null || (urls = imageModel.getUrls()) == null || (str2 = (String) ListProtector.get(urls, 0)) == null || (strLJJLJLI = a0.LJJLJLI(str2, e3.d, str2)) == null) {
                    strLJJLJLI = "";
                }
                String str4 = emoteModel.emoteId;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str.length() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i3 = i2 ^ 1;
                if (str.length() != 0) {
                    str3 = str;
                }
                emotePerformanceTrackerViewModel.yQ2(i, str4, jCurrentTimeMillis, i3, str3, strLJJLJLI);
            }
        }
        EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel2 = (EmotePerformanceTrackerViewModel) this.LLJIJIL.getValue();
        if (emotePerformanceTrackerViewModel2 != null && (list = emotePerformanceTrackerViewModel2.LLJ) != null && ((ArrayList) list).isEmpty()) {
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel3 = (EmotePerformanceTrackerViewModel) this.LLJIJIL.getValue();
            if (emotePerformanceTrackerViewModel3 != null) {
                emotePerformanceTrackerViewModel3.LLILLL = System.currentTimeMillis();
            }
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel4 = (EmotePerformanceTrackerViewModel) this.LLJIJIL.getValue();
            if (emotePerformanceTrackerViewModel4 != null) {
                emotePerformanceTrackerViewModel4.xQ2();
            }
        }
    }

    public C1115580f8W(View view, InterfaceC1115480f8M<EmoteModel> interfaceC1115480f8M, InterfaceC1115630f8b interfaceC1115630f8b, String str, Function0<Boolean> function0) {
        super(view);
        this.LL = interfaceC1115480f8M;
        this.LLILLJJLI = interfaceC1115630f8b;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = (C19R6) view.findViewById(R.id.lfr);
        this.LLILZLL = (FrameLayout) view.findViewById(R.id.v53);
        this.LLIZ = (C1324720kZq) view.findViewById(R.id.wnx);
        this.LLIZLLLIL = (ConstraintLayout) view.findViewById(R.id.wny);
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJIJIL = C452501pT.LIZIZ(new AwS418S0200000_17(view, this, 103));
    }
}
