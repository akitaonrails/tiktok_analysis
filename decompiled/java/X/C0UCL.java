package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostC2PACheckSettings;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UCL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCL extends FrameLayout {
    public static final /* synthetic */ int LLJJ = 0;
    public int LL;
    public final ViewGroup LLILLJJLI;
    public final RecyclerView LLILLL;
    public final IHostCreativeTool LLILZ;
    public String LLILZIL;
    public final C473220Ih6 LLILZLL;
    public WeakReference<DataChannel> LLIZ;
    public LiveEffect LLIZLLLIL;
    public String LLJ;
    public Function2<? super String, ? super String, Integer> LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C0UCK LLJILLL;

    public final AbstractC21674019s2 getSmoothScroller() {
        return (AbstractC21674019s2) this.LLJILJILJ.getValue();
    }

    public final int getFromStickerPanel() {
        return this.LL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0UCK, X.14E9] */
    public C0UCL(Context context) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        super(context, null, 0);
        LifecycleOwner lifecycleOwner = null;
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
        this.LLILZ = iHostCreativeTool;
        this.LLILZIL = C0UD4.LIZIZ;
        C473220Ih6 c473220Ih6 = new C473220Ih6();
        this.LLILZLL = c473220Ih6;
        this.LLJ = "";
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(context, 722));
        ?? r1 = new C14E9() { // from class: X.0UCK
            @Override // X.C14E9
            public final void LLZLI(String str) {
                String imgK;
                int iLLLFZ;
                RecyclerView.LayoutManager layoutManager;
                LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
                LiveEffect.PlDataBean plDataBean;
                C0UCL c0ucl = this.LIZ;
                IHostCreativeTool iHostCreativeTool2 = c0ucl.LLILZ;
                LiveEffect liveEffect = c0ucl.LLIZLLLIL;
                if (liveEffect == null || (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) == null || (plDataBean = stickerSDKExtraLJLJLLL.pl) == null || (imgK = plDataBean.getImgK()) == null) {
                    imgK = "";
                }
                iHostCreativeTool2.resizePhoto(imgK, str);
                C0UCT c0uctLIZLLL = C0UF5.LIZLLL();
                if (c0uctLIZLLL != null) {
                    c0uctLIZLLL.LIZ = str;
                }
                if (str != null && (iLLLFZ = this.LIZ.LLILZLL.LLLFZ(str)) >= 0) {
                    this.LIZ.getSmoothScroller().LIZ = iLLLFZ;
                    RecyclerView recyclerView = this.LIZ.LLILLL;
                    if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                        layoutManager.startSmoothScroll(this.LIZ.getSmoothScroller());
                    }
                }
            }

            @Override // X.C14E9
            public final void f(List<String> list) {
                C473220Ih6 c473220Ih62 = this.LIZ.LLILZLL;
                ((ArrayList) c473220Ih62.LL).clear();
                ((ArrayList) c473220Ih62.LL).addAll(list);
                c473220Ih62.notifyDataSetChanged();
            }

            @Override // X.C14E9
            public final void LLLLLLLLL(String str, String str2, String str3) {
                String str4;
                C520080KaU.LIZ.getClass();
                if (LiveHostC2PACheckSettings.enable() && str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                    List<Pair<String, String>> list = C520080KaU.LJFF;
                    ArrayList arrayList = (ArrayList) list;
                    arrayList.add(new Pair(str2, str3));
                    if (arrayList.size() > 5) {
                        C19719612Di.LJJIIZI(list);
                    }
                }
                C0UCL c0ucl = this.LIZ;
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                c0ucl.LLJ = str4;
                Function2<? super String, ? super String, Integer> function2 = c0ucl.LLJI;
                if (function2 == null || str == null || str2 == null) {
                    return;
                }
                function2.invoke(str, str2);
            }
        };
        this.LLJILLL = r1;
        FrameLayout.inflate(context, R.layout.hn2, this);
        C19EG c19egLJ = C500260Jjc.LJ(context);
        if (c19egLJ != null) {
            iHostCreativeTool.Aq1(c19egLJ, r1);
        }
        C500260Jjc.LJIILIIL(this);
        findViewById(R.id.trr).getBackground().setAlpha(255);
        View viewFindViewById = findViewById(R.id.ul6);
        C786410Ut5.O7((FrameLayout) viewFindViewById, new ACListenerS147S0100000_12((Object) this, 295));
        this.LLILLJJLI = (ViewGroup) viewFindViewById;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mel);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(c473220Ih6);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.LLILLL = recyclerView;
        WeakReference<DataChannel> weakReference = this.LLIZ;
        if (weakReference != null && (dataChannel = weakReference.get()) != null) {
            WeakReference<DataChannel> weakReference2 = this.LLIZ;
            if (weakReference2 != null && (dataChannel2 = weakReference2.get()) != null) {
                lifecycleOwner = dataChannel2.LLILZ;
            }
            dataChannel.EQ2(lifecycleOwner, GreenScreenCreatorBlockChannel.class, new AwS591S0100000_12(this, 729));
        }
    }

    public final boolean LIZ(LiveEffect liveEffect) {
        Boolean boolValueOf;
        if (liveEffect != null) {
            boolValueOf = Boolean.valueOf(liveEffect.LJJJJLL());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && this.LLJIJIL) {
            C500260Jjc.LJIILIIL(getRootView());
            return true;
        }
        return false;
    }

    public final void setFromStickerPanel(int i) {
        this.LL = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8 || (i == 0 && this.LLJILJIL)) {
            super.setVisibility(i);
        }
    }

    public static boolean LIZIZ(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (Intrinsics.LJFF(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ(final LiveEffect liveEffect, boolean z) {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        String[] strArr;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (z && liveEffect != null) {
            if (Intrinsics.LJFF(this.LLILZIL, C0UD4.LJ)) {
                C0UC5 c0uc5 = C0UC5.LIZ;
                WeakReference<DataChannel> weakReference = this.LLIZ;
                if (weakReference != null) {
                    dataChannel2 = weakReference.get();
                } else {
                    dataChannel2 = null;
                }
                c0uc5.LIZJ(liveEffect, dataChannel2, 0, false, null);
            } else {
                WeakReference<DataChannel> weakReference2 = this.LLIZ;
                if (weakReference2 != null && (dataChannel = weakReference2.get()) != null) {
                    dataChannel.LC0(StickerSelectedEvent.class, new C0UCF(liveEffect, this.LLILZIL, "", C500260Jjc.LJIL()));
                }
            }
        }
        if (LIZ(liveEffect)) {
            return;
        }
        if (liveEffect != null && (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) != null && stickerSDKExtraLJLJLLL.pl != null) {
            if (!Intrinsics.LJFF(this.LLIZLLLIL, liveEffect)) {
                C500260Jjc.LJIILIIL(this);
                int i = Build.VERSION.SDK_INT;
                if (i <= 32) {
                    strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
                } else if (i >= 34) {
                    strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
                } else {
                    strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
                }
                C19EG c19egLJ = C500260Jjc.LJ(getContext());
                if (c19egLJ != null) {
                    new C0UT9(c19egLJ, TokenCert.Companion.with("bpea-green_screen_effect_read_gallery")).LIZ(new C142V() { // from class: X.0UCM
                        @Override // X.C142V
                        public final /* synthetic */ void LIZIZ(String... strArr2) {
                        }

                        @Override // X.C142V
                        public final /* synthetic */ void LIZLLL(String... strArr2) {
                        }

                        @Override // X.C142V
                        public final /* synthetic */ void LJ(String str, String... strArr2) {
                        }

                        @Override // X.C142V
                        public final /* synthetic */ void LJFF(String... strArr2) {
                        }

                        @Override // X.C142V
                        public final void LIZ(String... strArr2) {
                            C766270U4b.LIZLLL(2131841512);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
                        /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
                        @Override // X.C142V
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZJ(java.lang.String... r5) {
                            /*
                                Method dump skipped, instruction units count: 203
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0UCM.LIZJ(java.lang.String[]):void");
                        }
                    }, true, (String[]) Arrays.copyOf(strArr, strArr.length));
                }
            }
        } else {
            if (z) {
                C473220Ih6 c473220Ih6 = this.LLILZLL;
                c473220Ih6.LLILLL = null;
                C0UCT c0uctLIZLLL = C0UF5.LIZLLL();
                if (c0uctLIZLLL != null) {
                    c0uctLIZLLL.LIZ = "";
                }
                c473220Ih6.LLLFZ("");
            }
            C500260Jjc.LJIILIIL(this);
        }
        this.LLIZLLLIL = liveEffect;
    }
}
