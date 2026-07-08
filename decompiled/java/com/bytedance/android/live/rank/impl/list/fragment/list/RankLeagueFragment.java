package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC485930J3v;
import X.C0JT6;
import X.C1117370fBP;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C1324720kZq;
import X.C16FS;
import X.C1809980xCW;
import X.C1809990xCX;
import X.C1810150xCn;
import X.C1810690xDf;
import X.C1810900xE0;
import X.C1810920xE2;
import X.C1811230xEX;
import X.C20337914i1;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import X.CountDownTimerC1811820xFU;
import X.InterfaceC1094280eaA;
import X.InterfaceC1810050xCd;
import X.InterfaceC1811830xFV;
import X.RunnableC781530UlD;
import Y.AObserverS229S0100000_27;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankLeagueFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class RankLeagueFragment extends GiftListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZiHELIOSklOjt9LjctLiI2JjFiJSYgPGseKCE4BCAtLjo2DjctLiI2JjE=";
    public View LLLILZLLLI;
    public C1324720kZq LLLIZZ;
    public TextView LLLJ;
    public TextView LLLJIL;
    public C16FS LLLJL;
    public boolean LLLL;
    public CountDownTimerC1811820xFU LLLLII;
    public final C1810920xE2 LLLLIIIILLL = new InterfaceC1811830xFV() { // from class: X.0xE2
        @Override // X.InterfaceC1811830xFV
        public final void LJJI(long j) {
        }

        @Override // X.InterfaceC1811830xFV
        public final void LIZLLL() {
            View view = this.LIZ.LLLILZLLLI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            this.LIZ.LLLL = false;
        }
    };

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public final void MR(boolean z) {
        RankListController rankListController;
        RankListViewModel rankListViewModelLJIIIZ;
        MutableLiveData<C1809980xCW> mutableLiveData;
        C1809980xCW value;
        super.MR(z);
        if (z && (rankListController = this.LLILZIL) != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null && (mutableLiveData = rankListViewModelLJIIIZ.LLIZ) != null && (value = mutableLiveData.getValue()) != null) {
            gS(value);
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void VR(RankListV2Response.RankInfo rankInfo) {
        TextView textView;
        super.VR(rankInfo);
        if (rankInfo != null && (textView = this.LLJJJJLIIL) != null && rankInfo.rankStr.length() > 3) {
            textView.setTextSize(13.0f);
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void ZR(C1117370fBP c1117370fBP) {
        super.ZR(c1117370fBP);
        final DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        final int iHashCode = hashCode();
        final AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c1117370fBP, 90);
        c1117370fBP.LLLFZ(C1809990xCX.class, new AbstractC485930J3v<C1809990xCX, C1810900xE0>(iHashCode, dataChannelLJ, awS571S0100000_27) { // from class: X.0xDh
            public final DataChannel LIZLLL;
            public final int LJ;
            public final Function0<Object> LJFF;

            @Override // X.AbstractC485930J3v, X.C0J8P
            public final void LJII(RecyclerView.ViewHolder viewHolder) {
                C1810900xE0 c1810900xE0 = (C1810900xE0) viewHolder;
                super.LJII(c1810900xE0);
                CountDownTimerC1811820xFU countDownTimerC1811820xFU = c1810900xE0.LLILZLL;
                if (countDownTimerC1811820xFU != null) {
                    countDownTimerC1811820xFU.cancel();
                }
                CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = c1810900xE0.LLILZLL;
                if (countDownTimerC1811820xFU2 != null) {
                    countDownTimerC1811820xFU2.LIZ = null;
                }
            }

            @Override // X.AbstractC485930J3v, X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                int i;
                final C1810900xE0 c1810900xE0 = (C1810900xE0) viewHolder;
                C1809990xCX c1809990xCX = (C1809990xCX) obj;
                int i2 = this.LJ;
                final Function0<Object> function0 = this.LJFF;
                Text text = null;
                if (c1810900xE0.LLILZ != i2) {
                    c1810900xE0.LLILZ = i2;
                    InterfaceC1811830xFV interfaceC1811830xFV = new InterfaceC1811830xFV() { // from class: X.0xE1
                        @Override // X.InterfaceC1811830xFV
                        public final void LIZLLL() {
                            c1810900xE0.LLILZIL = 0L;
                        }

                        @Override // X.InterfaceC1811830xFV
                        public final void LJJI(long j) {
                            c1810900xE0.LLILZIL = j / 1000;
                            function0.invoke();
                        }
                    };
                    c1810900xE0.LLILZIL = c1809990xCX.LIZJ;
                    CountDownTimerC1811820xFU countDownTimerC1811820xFU = c1810900xE0.LLILZLL;
                    if (countDownTimerC1811820xFU != null) {
                        countDownTimerC1811820xFU.cancel();
                    }
                    CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = c1810900xE0.LLILZLL;
                    if (countDownTimerC1811820xFU2 != null) {
                        countDownTimerC1811820xFU2.LIZ = null;
                    }
                    CountDownTimerC1811820xFU countDownTimerC1811820xFU3 = new CountDownTimerC1811820xFU(c1810900xE0.LLILZIL * 1000);
                    countDownTimerC1811820xFU3.start();
                    countDownTimerC1811820xFU3.LIZ = interfaceC1811830xFV;
                    c1810900xE0.LLILZLL = countDownTimerC1811820xFU3;
                }
                int i3 = c1809990xCX.LJ;
                if (i3 == 1 || i3 != 2) {
                    C1143680frq.LIZLLL(c1810900xE0.LL, "tiktok_live_revenue_demand_1", "ttlive_icon_rank_league_stage_locked_gift.png");
                } else {
                    C1143680frq.LIZLLL(c1810900xE0.LL, "tiktok_live_revenue_demand_1", "ttlive_icon_rank_league_stage_locked_viewer.png");
                }
                C786410Ut5.LLIL(c1810900xE0.LLILLJJLI, 0);
                C786410Ut5.LLIL(c1810900xE0.LLILLL, 0);
                long j = c1810900xE0.LLILZIL;
                int i4 = c1809990xCX.LIZLLL;
                long j2 = 86400;
                long j3 = j / j2;
                long j4 = j % j2;
                long j5 = 3600;
                long j6 = j4 / j5;
                long j7 = j4 % j5;
                long j8 = 60;
                long j9 = j7 / j8;
                long j10 = j7 % j8;
                if (j3 > 0) {
                    if (i4 == 2) {
                        i = 2131755614;
                    } else {
                        i = 2131755611;
                    }
                } else if (j6 > 0) {
                    if (i4 == 2) {
                        i = 2131755615;
                    } else {
                        i = 2131755612;
                    }
                    j3 = j6;
                } else if (j9 > 0) {
                    if (i4 == 2) {
                        i = 2131755616;
                    } else {
                        i = 2131755613;
                    }
                    j3 = j9;
                } else {
                    if (i4 == 2) {
                        i = 2131755617;
                    } else {
                        i = 2131755610;
                    }
                    j3 = j10;
                }
                c1810900xE0.LLILLJJLI.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(i, (int) j3), Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)));
                TextView textView = c1810900xE0.LLILLL;
                RankListV2Response.BriefDescription briefDescription = c1809990xCX.LIZIZ;
                if (briefDescription != null) {
                    text = briefDescription.rule;
                }
                textView.setText(C1133830fbx.LJIILIIL(text, "").toString());
            }

            @Override // X.AbstractC485930J3v
            public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
                Boolean bool;
                DataChannel dataChannel = this.LIZLLL;
                if ((dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) && viewGroup != null) {
                    view.getLayoutParams().height = viewGroup.getHeight();
                }
                return new C1810900xE0(view);
            }

            {
                super(R.layout.h3z, Boolean.FALSE);
                this.LIZLLL = dataChannelLJ;
                this.LJ = iHashCode;
                this.LJFF = awS571S0100000_27;
            }
        });
        final int iHashCode2 = hashCode();
        final AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27(c1117370fBP, 91);
        c1117370fBP.LLLFZ(C1810150xCn.class, new AbstractC485930J3v<C1810150xCn, C1811230xEX>(iHashCode2, awS571S0100000_272) { // from class: X.0xEW
            public final int LIZLLL;
            public final Function0<Object> LJ;

            @Override // X.AbstractC485930J3v, X.C0J8P
            public final void LJII(RecyclerView.ViewHolder viewHolder) {
                C1811230xEX c1811230xEX = (C1811230xEX) viewHolder;
                super.LJII(c1811230xEX);
                C786410Ut5.I7(null, c1811230xEX.itemView);
                CountDownTimerC1811820xFU countDownTimerC1811820xFU = c1811230xEX.LLJJJ;
                if (countDownTimerC1811820xFU != null) {
                    countDownTimerC1811820xFU.cancel();
                }
                CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = c1811230xEX.LLJJJ;
                if (countDownTimerC1811820xFU2 != null) {
                    countDownTimerC1811820xFU2.LIZ = null;
                }
            }

            {
                super(R.layout.gui, Boolean.FALSE);
                this.LIZLLL = iHashCode2;
                this.LJ = awS571S0100000_272;
            }

            @Override // X.AbstractC485930J3v, X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                Text text;
                boolean zBooleanValue;
                boolean z;
                boolean zBooleanValue2;
                boolean zBooleanValue3;
                final C1811230xEX c1811230xEX = (C1811230xEX) viewHolder;
                final C1810150xCn c1810150xCn = (C1810150xCn) obj;
                int i = this.LIZLLL;
                final Function0<Object> function0 = this.LJ;
                Text text2 = null;
                if (c1811230xEX.LLJJ != i) {
                    c1811230xEX.LLJJ = i;
                    c1811230xEX.LLJJI = false;
                    c1811230xEX.LLJJIII = false;
                    c1811230xEX.LLJJIJI = false;
                    c1811230xEX.LLJJIJIIJIL = true;
                    InterfaceC1811830xFV interfaceC1811830xFV = new InterfaceC1811830xFV() { // from class: X.0xEZ
                        @Override // X.InterfaceC1811830xFV
                        public final void LIZLLL() {
                            C1811230xEX c1811230xEX2 = c1811230xEX;
                            c1811230xEX2.LLJJI = false;
                            c1811230xEX2.LLJJIII = false;
                            c1811230xEX2.LLJJIJI = false;
                            c1811230xEX2.LLJJIJIIJIL = true;
                            function0.invoke();
                        }

                        @Override // X.InterfaceC1811830xFV
                        public final void LJJI(long j) {
                            c1811230xEX.LLJJIJIL = j / 1000;
                            function0.invoke();
                        }
                    };
                    c1811230xEX.LLJJIJIL = c1810150xCn.LIZJ;
                    CountDownTimerC1811820xFU countDownTimerC1811820xFU = c1811230xEX.LLJJJ;
                    if (countDownTimerC1811820xFU != null) {
                        countDownTimerC1811820xFU.cancel();
                    }
                    CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = c1811230xEX.LLJJJ;
                    if (countDownTimerC1811820xFU2 != null) {
                        countDownTimerC1811820xFU2.LIZ = null;
                    }
                    CountDownTimerC1811820xFU countDownTimerC1811820xFU3 = new CountDownTimerC1811820xFU(c1811230xEX.LLJJIJIL * 1000);
                    countDownTimerC1811820xFU3.start();
                    countDownTimerC1811820xFU3.LIZ = interfaceC1811830xFV;
                    c1811230xEX.LLJJJ = countDownTimerC1811820xFU3;
                }
                TextView textView = c1811230xEX.LL;
                RankListV2Response.BriefDescription briefDescription = c1810150xCn.LIZIZ;
                if (briefDescription != null) {
                    text = briefDescription.title;
                } else {
                    text = null;
                }
                textView.setText(C1133830fbx.LJIILIIL(text, "").toString());
                c1811230xEX.LLILLJJLI.setText(C497740JfY.LJIJJ(2131844558, c1810150xCn.LJII));
                TextView textView2 = c1811230xEX.LLILLL;
                RankListV2Response.BriefDescription briefDescription2 = c1810150xCn.LIZIZ;
                if (briefDescription2 != null) {
                    text2 = briefDescription2.rule;
                }
                textView2.setText(C1133830fbx.LJIILIIL(text2, "").toString());
                int i2 = c1810150xCn.LJI;
                if (i2 == 1 || i2 != 2) {
                    C1324570kZb.LIZ(c1811230xEX.LLILZLL, R.drawable.eu3);
                } else {
                    C1324570kZb.LIZ(c1811230xEX.LLILZLL, R.drawable.eu5);
                }
                C786410Ut5.LLJJIII(c1811230xEX.LLILZLL, 0);
                int i3 = c1810150xCn.LJFF;
                if (i3 != 2) {
                    if (i3 == 3) {
                        C786410Ut5.LL(8, c1811230xEX.LLIZ);
                        C786410Ut5.LLIL(c1811230xEX.LL, 0);
                        c1811230xEX.LLILLJJLI.setTextColor(C497740JfY.LJFF(R.color.f571dc));
                        c1811230xEX.LLILLL.setTextColor(C497740JfY.LJFF(R.color.f571dc));
                        ImageView imageView = c1811230xEX.LLILZ;
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(4.0f);
                            C786410Ut5.W5(imageView, marginLayoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                    }
                } else {
                    C786410Ut5.LL(0, c1811230xEX.LLIZ);
                    C786410Ut5.LLIL(c1811230xEX.LL, 8);
                    c1811230xEX.LLILLJJLI.setTextColor(C497740JfY.LJFF(R.color.da));
                    c1811230xEX.LLILLL.setTextColor(C497740JfY.LJFF(R.color.dg));
                    ImageView imageView2 = c1811230xEX.LLILZ;
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(5.0f);
                        C786410Ut5.W5(imageView2, marginLayoutParams2);
                        long j = c1811230xEX.LLJJIJIL;
                        long j2 = 86400;
                        long j3 = j / j2;
                        long j4 = j % j2;
                        long j5 = 3600;
                        long j6 = j4 / j5;
                        long j7 = j4 % j5;
                        long j8 = 60;
                        long j9 = j7 / j8;
                        long j10 = j7 % j8;
                        c1811230xEX.LLIZLLLIL.setText(C1811230xEX.I5(j3));
                        c1811230xEX.LLJIJIL.setText(C1811230xEX.I5(j9));
                        if (C497740JfY.LJJ()) {
                            c1811230xEX.LLJI.setText(C1811230xEX.I5(j10));
                            c1811230xEX.LLJILJIL.setText(C1811230xEX.I5(j6));
                        } else {
                            c1811230xEX.LLJI.setText(C1811230xEX.I5(j6));
                            c1811230xEX.LLJILJIL.setText(C1811230xEX.I5(j10));
                        }
                        c1811230xEX.LLJ.setText(C497740JfY.LJIIJJI(2131755618, (int) j3));
                        c1811230xEX.LLJILJILJ.setText(":");
                        c1811230xEX.LLJILLL.setText(":");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
                if (c1811230xEX.LLJJIJIIJIL) {
                    int i4 = c1810150xCn.LJ;
                    long j11 = c1810150xCn.LIZLLL;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                C0JT6<Boolean> c0jt6 = InterfaceC1094280eaA.gd;
                                Boolean boolLIZ = c0jt6.LIZ();
                                if (boolLIZ != null) {
                                    zBooleanValue3 = boolLIZ.booleanValue();
                                } else {
                                    zBooleanValue3 = false;
                                }
                                c1811230xEX.LLJJIJI = zBooleanValue3;
                                if (zBooleanValue3 && !C1811230xEX.N5(i4, j11)) {
                                    c1811230xEX.LLJJIJI = false;
                                }
                                if (!c1811230xEX.LLJJIJI) {
                                    c0jt6.LIZJ(Boolean.TRUE);
                                }
                            }
                        } else {
                            C0JT6<Boolean> c0jt62 = InterfaceC1094280eaA.fd;
                            Boolean boolLIZ2 = c0jt62.LIZ();
                            if (boolLIZ2 != null) {
                                zBooleanValue2 = boolLIZ2.booleanValue();
                            } else {
                                zBooleanValue2 = false;
                            }
                            c1811230xEX.LLJJIII = zBooleanValue2;
                            if (zBooleanValue2 && !C1811230xEX.N5(i4, j11)) {
                                c1811230xEX.LLJJIII = false;
                            }
                            if (!c1811230xEX.LLJJIII) {
                                c0jt62.LIZJ(Boolean.TRUE);
                            }
                        }
                        z = false;
                    } else {
                        C0JT6<Boolean> c0jt63 = InterfaceC1094280eaA.ed;
                        Boolean boolLIZ3 = c0jt63.LIZ();
                        if (boolLIZ3 != null) {
                            zBooleanValue = boolLIZ3.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        c1811230xEX.LLJJI = zBooleanValue;
                        if (zBooleanValue && !C1811230xEX.N5(i4, j11)) {
                            z = false;
                            c1811230xEX.LLJJI = false;
                        } else {
                            z = false;
                        }
                        if (!c1811230xEX.LLJJI) {
                            c0jt63.LIZJ(Boolean.TRUE);
                        }
                    }
                    c1811230xEX.LLJJIJIIJIL = z;
                }
                int i5 = c1810150xCn.LJ;
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            if (!c1811230xEX.LLJJIJI) {
                                c1811230xEX.P5();
                            } else {
                                c1811230xEX.L5();
                            }
                        }
                    } else if (!c1811230xEX.LLJJIII) {
                        c1811230xEX.P5();
                    } else {
                        c1811230xEX.L5();
                    }
                } else if (!c1811230xEX.LLJJI) {
                    c1811230xEX.P5();
                } else {
                    c1811230xEX.L5();
                }
                C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xEY
                    @Override // X.AbstractViewOnClickListenerC1105820esm
                    public final void LIZ() {
                        C1811230xEX c1811230xEX2 = c1811230xEX;
                        int i6 = c1810150xCn.LJ;
                        Function0<Object> function02 = function0;
                        if (i6 == 1) {
                            c1811230xEX2.LLJJI = !c1811230xEX2.LLJJI;
                        } else if (i6 == 2) {
                            c1811230xEX2.LLJJIII = !c1811230xEX2.LLJJIII;
                        } else if (i6 != 3) {
                            c1811230xEX2.getClass();
                        } else {
                            c1811230xEX2.LLJJIJI = !c1811230xEX2.LLJJIJI;
                        }
                        function02.invoke();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1200L);
                    }
                }, c1811230xEX.itemView);
            }

            @Override // X.AbstractC485930J3v
            public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
                return new C1811230xEX(view);
            }
        });
    }

    public final void gS(C1809980xCW c1809980xCW) {
        RankRootViewModel rankRootViewModelLIZ;
        String strLJIJI;
        RankListV2Response.RankView rankView;
        RankListViewModel rankListViewModelLJIIIZ;
        InterfaceC1810050xCd interfaceC1810050xCd;
        int i = c1809980xCW.LIZIZ;
        long j = c1809980xCW.LIZLLL;
        RankListController rankListController = this.LLILZIL;
        if (rankListController != null && (rankRootViewModelLIZ = rankListController.LIZ()) != null && rankRootViewModelLIZ.LLILLL && 1 != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C0JT6<Boolean> c0jt6 = InterfaceC1094280eaA.md;
                        Boolean boolLIZ = c0jt6.LIZ();
                        if (boolLIZ == null || !boolLIZ.booleanValue() || !dS(i, j)) {
                            c0jt6.LIZJ(Boolean.TRUE);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C0JT6<Boolean> c0jt62 = InterfaceC1094280eaA.ld;
                    Boolean boolLIZ2 = c0jt62.LIZ();
                    if (boolLIZ2 == null || !boolLIZ2.booleanValue() || !dS(i, j)) {
                        c0jt62.LIZJ(Boolean.TRUE);
                    } else {
                        return;
                    }
                }
            } else {
                C0JT6<Boolean> c0jt63 = InterfaceC1094280eaA.kd;
                Boolean boolLIZ3 = c0jt63.LIZ();
                if (boolLIZ3 == null || !boolLIZ3.booleanValue() || !dS(i, j)) {
                    c0jt63.LIZJ(Boolean.TRUE);
                } else {
                    return;
                }
            }
            if (this.LLLL) {
                return;
            }
            this.LLLL = true;
            if (this.LLLILZLLLI == null && (getView() instanceof ViewGroup)) {
                this.LLLILZLLLI = C786410Ut5.Td(getLayoutInflater(), R.layout.h3y, (ViewGroup) getView(), false);
            }
            View view = this.LLLILZLLLI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                RankPageController rankPageControllerRR = RR();
                if (rankPageControllerRR != null && (interfaceC1810050xCd = rankPageControllerRR.LLIZLLLIL) != null) {
                    interfaceC1810050xCd.ko(view, false);
                }
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xE3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                }, view);
                this.LLLIZZ = (C1324720kZq) view.findViewById(R.id.lsq);
                this.LLLJ = (TextView) view.findViewById(R.id.tv_rank_league_promotion_title);
                this.LLLJIL = (TextView) view.findViewById(R.id.tv_rank_league_promotion_subtitle);
                this.LLLJL = (C16FS) view.findViewById(R.id.ctu);
                C1324720kZq c1324720kZq = this.LLLIZZ;
                if (c1324720kZq != null) {
                    C786410Ut5.LLJJIII(c1324720kZq, 0);
                }
                TextView textView = this.LLLJ;
                if (textView != null) {
                    C786410Ut5.LLIL(textView, 0);
                }
                TextView textView2 = this.LLLJIL;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
                C16FS c16fs = this.LLLJL;
                if (c16fs != null) {
                    C786410Ut5.LLJJJ(c16fs, 4);
                }
                int i2 = c1809980xCW.LIZJ;
                if (i2 != 1) {
                    if (i2 != 2) {
                        strLJIJI = "";
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131844560);
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131844562);
                }
                int i3 = c1809980xCW.LIZIZ;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            TextView textView3 = this.LLLJ;
                            if (textView3 != null) {
                                textView3.setText(C497740JfY.LJIJI(2131844561));
                            }
                            TextView textView4 = this.LLLJIL;
                            if (textView4 != null) {
                                textView4.setText(strLJIJI);
                            }
                        }
                    } else {
                        TextView textView5 = this.LLLJ;
                        if (textView5 != null) {
                            textView5.setText(C497740JfY.LJIJI(2131844563));
                        }
                        TextView textView6 = this.LLLJIL;
                        if (textView6 != null) {
                            textView6.setText(strLJIJI);
                        }
                    }
                } else {
                    TextView textView7 = this.LLLJ;
                    if (textView7 != null) {
                        textView7.setText(C497740JfY.LJIJI(2131844567));
                    }
                    TextView textView8 = this.LLLJIL;
                    if (textView8 != null) {
                        textView8.setText(C497740JfY.LJIJI(2131844566));
                    }
                }
                C1324720kZq c1324720kZq2 = this.LLLIZZ;
                if (c1324720kZq2 != null) {
                    C1143920fsE c1143920fsE = new C1143920fsE();
                    c1143920fsE.LJFF = true;
                    c1143920fsE.LJI = 1;
                    c1143920fsE.LIZ = c1324720kZq2;
                    c1143920fsE.LIZIZ = "tiktok_live_revenue_demand_1";
                    c1143920fsE.LIZJ = "ttlive_icon_rank_league_promotion.webp";
                    c1143920fsE.LJ = new C1143950fsH() { // from class: X.0xDn
                        @Override // X.C1143950fsH
                        public final void LJFF(Animatable animatable) {
                            RankLeagueFragment rankLeagueFragment = this.LIZ;
                            CountDownTimerC1811820xFU countDownTimerC1811820xFU = rankLeagueFragment.LLLLII;
                            if (countDownTimerC1811820xFU != null) {
                                countDownTimerC1811820xFU.cancel();
                            }
                            CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = rankLeagueFragment.LLLLII;
                            if (countDownTimerC1811820xFU2 != null) {
                                countDownTimerC1811820xFU2.LIZ = null;
                            }
                            CountDownTimerC1811820xFU countDownTimerC1811820xFU3 = new CountDownTimerC1811820xFU(Mp4ScreenVideoLoadTimeout.CONTROL);
                            countDownTimerC1811820xFU3.start();
                            countDownTimerC1811820xFU3.LIZ = rankLeagueFragment.LLLLIIIILLL;
                            rankLeagueFragment.LLLLII = countDownTimerC1811820xFU3;
                            C16FS c16fs2 = this.LIZ.LLLJL;
                            if (c16fs2 != null) {
                                C786410Ut5.LLJJJ(c16fs2, 0);
                            }
                            C16FS c16fs3 = this.LIZ.LLLJL;
                            if (c16fs3 != null) {
                                final RankLeagueFragment rankLeagueFragment2 = this.LIZ;
                                C786410Ut5.h8(c16fs3, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xDy
                                    @Override // X.AbstractViewOnClickListenerC1105820esm
                                    public final void LIZ() {
                                        View view2 = rankLeagueFragment2.LLLILZLLLI;
                                        if (view2 != null) {
                                            C786410Ut5.LJLLLLLL(8, view2);
                                        }
                                        RankLeagueFragment rankLeagueFragment3 = rankLeagueFragment2;
                                        rankLeagueFragment3.LLLL = false;
                                        CountDownTimerC1811820xFU countDownTimerC1811820xFU4 = rankLeagueFragment3.LLLLII;
                                        if (countDownTimerC1811820xFU4 != null) {
                                            countDownTimerC1811820xFU4.cancel();
                                        }
                                        CountDownTimerC1811820xFU countDownTimerC1811820xFU5 = rankLeagueFragment3.LLLLII;
                                        if (countDownTimerC1811820xFU5 != null) {
                                            countDownTimerC1811820xFU5.LIZ = null;
                                        }
                                        rankLeagueFragment3.LLLLII = null;
                                    }

                                    {
                                        super(1200L);
                                    }
                                });
                            }
                            C16FS c16fs4 = this.LIZ.LLLJL;
                            if (c16fs4 != null) {
                                c16fs4.setText(C497740JfY.LJIJI(2131843903));
                            }
                        }
                    };
                    C1143680frq.LJIIIIZZ(c1143920fsE);
                }
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                RankListController rankListController2 = this.LLILZIL;
                if (rankListController2 != null && (rankListViewModelLJIIIZ = rankListController2.LJIIIZ()) != null) {
                    rankView = rankListViewModelLJIIIZ.LLILLJJLI;
                } else {
                    rankView = null;
                }
                C1810690xDf.LJJIFFI(c1810690xDf, dataChannelLJ, rankView, this.LLILLL, true, null, null, 112);
            }
        }
    }

    public final boolean dS(int i, long j) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                C20337914i1<Long> c20337914i1 = InterfaceC1094280eaA.jd;
                Long lLIZIZ = c20337914i1.LIZIZ();
                if (lLIZIZ == null || j != lLIZIZ.longValue()) {
                    c20337914i1.LJFF(Long.valueOf(j));
                    return false;
                }
            } else {
                C20337914i1<Long> c20337914i12 = InterfaceC1094280eaA.id;
                Long lLIZIZ2 = c20337914i12.LIZIZ();
                if (lLIZIZ2 == null || j != lLIZIZ2.longValue()) {
                    c20337914i12.LJFF(Long.valueOf(j));
                    return false;
                }
            }
        } else {
            C20337914i1<Long> c20337914i13 = InterfaceC1094280eaA.hd;
            Long lLIZIZ3 = c20337914i13.LIZIZ();
            if (lLIZIZ3 == null || j != lLIZIZ3.longValue()) {
                c20337914i13.LJFF(Long.valueOf(j));
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC21673719rz itemAnimator;
        RankListViewModel rankListViewModelLJIIIZ;
        MutableLiveData<C1809980xCW> mutableLiveData;
        super.onViewCreated(view, bundle);
        RankListController rankListController = this.LLILZIL;
        if (rankListController != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null && (mutableLiveData = rankListViewModelLJIIIZ.LLIZ) != null) {
            mutableLiveData.observe(this, new AObserverS229S0100000_27(this, 13));
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJJJ;
        if (runnableC781530UlD != null) {
            itemAnimator = runnableC781530UlD.getItemAnimator();
        } else {
            itemAnimator = null;
        }
        ((AbstractC21674919sB) itemAnimator).LLIZ = false;
    }
}
