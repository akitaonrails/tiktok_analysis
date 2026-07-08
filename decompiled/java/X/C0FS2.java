package X;

import Y.ACListenerS109S0200000_5;
import Y.ACListenerS139S0100000_4;
import Y.ALAdapterS2S0100000_5;
import Y.AObserverS209S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FS2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FS2 extends C388270FKf {
    public final ViewGroup LIZIZ;
    public final C390250FRv LIZJ;
    public C1295960jpS LIZLLL;
    public C388620FLo LJ;
    public Map<C0FS9, ? extends List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic>> LJFF;
    public AddYoursStickerModel LJI;
    public int LJII;
    public final C1664680tQA<AddYoursStickerModel> LJIIIIZZ;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        this.LJII = -1;
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        this.LJII = -1;
    }

    public C0FS2(ViewGroup viewGroup, C390250FRv c390250FRv) {
        LiveData<List<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendInfo>> liveDataLIZIZ;
        AddYoursStickerTopicRepo addYoursStickerTopicRepoLJII;
        super(c390250FRv);
        this.LIZIZ = viewGroup;
        this.LIZJ = c390250FRv;
        this.LJFF = C2097608Jq.LJ();
        this.LJII = -1;
        this.LJIIIIZZ = c390250FRv.LJ;
        C786410Ut5.LJLZ(0, viewGroup);
        C1295960jpS c1295960jpS = (C1295960jpS) viewGroup.findViewById(R.id.ftr);
        this.LIZLLL = c1295960jpS;
        (c1295960jpS == null ? null : c1295960jpS).setAnimation("effect_dice_lottie.json");
        final C388620FLo c388620FLo = (C388620FLo) viewGroup.findViewById(R.id.afn);
        this.LJ = c388620FLo;
        c388620FLo = c388620FLo == null ? null : c388620FLo;
        if (C426750GoL.LIZLLL(c388620FLo.getContext())) {
            c388620FLo.LIZJ(0.0f, C418440Gaw.LIZIZ(10));
        } else {
            c388620FLo.LIZJ(C418440Gaw.LIZIZ(10), 0.0f);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c388620FLo.getContext());
        linearLayoutManager.setOrientation(0);
        c388620FLo.setLayoutManager(linearLayoutManager);
        c388620FLo.setAdapter(new AbstractC21673619ry<C339040DQw>(this) { // from class: X.0DQv
            public final /* synthetic */ C0FS2 LLILLJJLI;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list = this.LLILLJJLI.LJFF.get(C0FS9.HOT);
                if (list != null) {
                    return list.size();
                }
                return 0;
            }

            {
                this.LLILLJJLI = this;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                AddYoursStickerTopicRepoApi.AddYoursSuggestTopic addYoursSuggestTopic;
                C339040DQw c339040DQw = (C339040DQw) viewHolder;
                List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list = this.LLILLJJLI.LJFF.get(C0FS9.HOT);
                String str = null;
                if (list != null) {
                    addYoursSuggestTopic = (AddYoursStickerTopicRepoApi.AddYoursSuggestTopic) ListProtector.get(list, i);
                    if (addYoursSuggestTopic != null) {
                        str = addYoursSuggestTopic.text;
                    }
                } else {
                    addYoursSuggestTopic = null;
                }
                if (C123100dR.LIZ(str) && addYoursSuggestTopic != null) {
                    C786410Ut5.LJLLLLLL(0, c339040DQw.itemView);
                    TuxTextView tuxTextView = c339040DQw.LL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(addYoursSuggestTopic.text);
                    }
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup2, int i) {
                FrameLayout frameLayout = new FrameLayout(c388620FLo.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                frameLayout.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                layoutParams.gravity = 17;
                C786410Ut5.a6(frameLayout, layoutParams);
                C786410Ut5.LJZ(8, frameLayout);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                frameLayout.setBackground(c384050F3z.LIZ(frameLayout.getContext()));
                TuxTextView tuxTextView = new TuxTextView(c388620FLo.getContext(), null, 6, 0);
                C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -1));
                tuxTextView.setTuxFont(62);
                tuxTextView.setTextColorRes(R.attr.ee);
                tuxTextView.setGravity(17);
                frameLayout.addView(tuxTextView);
                C786410Ut5.O7(frameLayout, new ACListenerS109S0200000_5(this.LLILLJJLI, c388620FLo, 17));
                C339040DQw c339040DQw = new C339040DQw(frameLayout);
                c339040DQw.LL = tuxTextView;
                try {
                    View view = c339040DQw.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup2));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c339040DQw.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup2.hashCode()));
                try {
                    if (c339040DQw.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C339040DQw.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup2.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup3 = (ViewGroup) c339040DQw.itemView.getParent();
                            if (viewGroup3 != null) {
                                C786410Ut5.LJJJLZIJ(c339040DQw.itemView, viewGroup3);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C339040DQw.class.getName();
                return c339040DQw;
            }
        });
        c388620FLo.addItemDecoration(new C1767006w0(c388620FLo, 6));
        InterfaceC390170FRn interfaceC390170FRn = c390250FRv.LJI;
        if (interfaceC390170FRn != null && (addYoursStickerTopicRepoLJII = interfaceC390170FRn.LJII()) != null) {
            addYoursStickerTopicRepoLJII.LJFF(new AwS584S0100000_5(this, 152));
        }
        C1295960jpS c1295960jpS2 = this.LIZLLL;
        C1295960jpS c1295960jpS3 = c1295960jpS2 != null ? c1295960jpS2 : null;
        c1295960jpS3.setSpeed(1.5f);
        c1295960jpS3.addAnimatorListener(new ALAdapterS2S0100000_5(this, 2));
        C786410Ut5.c8(c1295960jpS3, new ACListenerS139S0100000_4(c1295960jpS3, 66));
        LifecycleOwner lifecycleOwner = c390250FRv.LIZLLL;
        InterfaceC390170FRn interfaceC390170FRn2 = c390250FRv.LJI;
        if (interfaceC390170FRn2 != null && (liveDataLIZIZ = interfaceC390170FRn2.LIZIZ()) != null) {
            liveDataLIZIZ.observe(lifecycleOwner, new AObserverS209S0100000_5(this, 15));
        }
    }
}
