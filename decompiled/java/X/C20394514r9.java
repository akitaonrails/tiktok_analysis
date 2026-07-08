package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.event.PlaybookLoadFetchListEvent;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicNonMGPlaybookFixTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUEOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlaybookSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: renamed from: X.14r9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20394514r9 implements InterfaceC20406714t7 {
    public final EnumC20429314wl LL;
    public final DataChannel LLILLJJLI;
    public final PlaybookAnchorViewModel LLILLL;
    public final Function1<Boolean, Unit> LLILZ;
    public final Function1<Boolean, Unit> LLILZIL;
    public final Function2<List<Playbook>, String, Unit> LLILZLL;
    public final Function1<Playbook, Integer> LLIZ;
    public final Function0<Context> LLIZLLLIL;
    public final Function0<C1117360fBO> LLJ;
    public boolean LLJI = true;
    public boolean LLJIJIL = true;
    public boolean LLJILJIL = true;
    public final Set<Integer> LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public long LLJJI;
    public boolean LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public C1324720kZq LLJJIJIL;
    public C16F5 LLJJJ;
    public C16F5 LLJJJIL;
    public View LLJJJJ;
    public C1324720kZq LLJJJJJIL;
    public final long LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    @Override // X.InterfaceC20408314tN
    public final void LIZIZ() {
        C20384514pX c20384514pX;
        Integer numValueOf;
        LJII("clickTryAgain");
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
        if (playbookAnchorViewModel == null || (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) == null || (numValueOf = Integer.valueOf(c20384514pX.LJJIL())) == null) {
            LJII("clickTryAgain return as curSelectTagType is null!");
        } else {
            LIZJ(true, LJ(), numValueOf.intValue(), false, null);
        }
    }

    public final int LJ() {
        C20384514pX c20384514pX;
        Integer numValueOf;
        if (this.LL == EnumC20429314wl.INTERACT) {
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
            if (playbookAnchorViewModel == null) {
                return 2;
            }
            numValueOf = Integer.valueOf(playbookAnchorViewModel.LLJJJ);
        } else {
            PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLL;
            if (playbookAnchorViewModel2 == null || (c20384514pX = playbookAnchorViewModel2.LLJJJJJIL) == null) {
                return 2;
            }
            numValueOf = Integer.valueOf(c20384514pX.LJJIJLIJ());
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 2;
    }

    public final void LJIIIIZZ() {
        MutableLiveData<C1158290gFP> mutableLiveData;
        MutableLiveData<List<Playbook>> mutableLiveData2;
        MutableLiveData<ActivePlaybook> mutableLiveData3;
        C20384514pX c20384514pX;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
        if (playbookAnchorViewModel != null && (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) != null) {
            c20384514pX.LJJ.LIZIZ();
            c20384514pX.LJJIFFI = false;
        }
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLL;
        if (playbookAnchorViewModel2 != null) {
            playbookAnchorViewModel2.FQ2();
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        PlaybookAnchorViewModel playbookAnchorViewModel3 = this.LLILLL;
        if (playbookAnchorViewModel3 != null && (mutableLiveData3 = playbookAnchorViewModel3.LLILLJJLI) != null) {
            mutableLiveData3.removeObserver((Observer) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
        PlaybookAnchorViewModel playbookAnchorViewModel4 = this.LLILLL;
        if (playbookAnchorViewModel4 != null && (mutableLiveData2 = playbookAnchorViewModel4.LLJILLL) != null) {
            mutableLiveData2.removeObserver((Observer) this.LLJJL.getValue());
        }
        PlaybookAnchorViewModel playbookAnchorViewModel5 = this.LLILLL;
        if (playbookAnchorViewModel5 == null || (mutableLiveData = playbookAnchorViewModel5.LLJJIJIIJIL) == null) {
            return;
        }
        mutableLiveData.removeObserver((Observer) this.LLJL.getValue());
    }

    @Override // X.InterfaceC20405014sq
    public final long LLJJ() {
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
        if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.playbook) == null) {
            return 0L;
        }
        return playbook.playbookId;
    }

    @Override // X.InterfaceC20405014sq
    public final long m2() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
        if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLJJ) == null || (value = mutableLiveData.getValue()) == null) {
            return 0L;
        }
        return value.longValue();
    }

    public static boolean LJI(PlaybookFetchListResponse.ResponseData responseData) {
        if (responseData.myPlaybooks.isEmpty() && responseData.favoritePlaybooks.isEmpty() && responseData.recommendedPlaybooks.isEmpty() && responseData.allTags.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final void LJII(String str) {
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookPolymerizationDialog"), str, null, null);
    }

    @Override // X.InterfaceC20406814t8
    public final void LIZ(PlaybookTagInfo playbookTagInfo) {
        ArrayList arrayList;
        LJII("onClickTagInfo");
        int iLIZ = C20385714pj.LIZ(this.LLILLL);
        int i = (playbookTagInfo.tagType << 8) | iLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickTagInfo combineTagValue:");
        sbLIZ.append(i);
        sbLIZ.append(" firstLevelTagType:");
        sbLIZ.append(iLIZ);
        sbLIZ.append(" tag:");
        sbLIZ.append(playbookTagInfo);
        LJII(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("clickTagInfo combineTagValue:");
        sbLIZ2.append(i);
        sbLIZ2.append(" firstLevelTagType:");
        sbLIZ2.append(iLIZ);
        sbLIZ2.append(" tag:");
        sbLIZ2.append(playbookTagInfo);
        C20441214yg.LIZIZ("PlaybookPolymerizationDialog", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLJILJILJ.contains(Integer.valueOf((playbookTagInfo.tagType << 8) | iLIZ))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("clickTagInfo tag:");
            sbLIZ3.append(playbookTagInfo);
            sbLIZ3.append(" already click");
            C20441214yg.LIZIZ("PlaybookPolymerizationDialog", C2188811AlT.LIZIZ(sbLIZ3));
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
            if (playbookAnchorViewModel != null) {
                int iLIZ2 = C20385714pj.LIZ(playbookAnchorViewModel);
                int i2 = playbookTagInfo.tagType;
                C20384514pX c20384514pX = playbookAnchorViewModel.LLJJJJJIL;
                c20384514pX.getClass();
                int i3 = (i2 << 8) | iLIZ2;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("loadTagTypeRecommendList combineTagTypeByFirstLevelAndSecondLevel:");
                sbLIZ4.append(i3);
                sbLIZ4.append(" firstLevelTagType:");
                sbLIZ4.append(iLIZ2);
                sbLIZ4.append(" tagType:");
                sbLIZ4.append(i2);
                C20441214yg.LIZIZ("PlaybookAnchorModel", C2188811AlT.LIZIZ(sbLIZ4));
                List<Playbook> list = c20384514pX.LJJ.get(Integer.valueOf(i3));
                c20384514pX.LJJII = i3;
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    arrayList = null;
                }
                C20384514pX.LJJJJJ(c20384514pX, arrayList, "loadTagTypeRecommendList");
                c20384514pX.LJJJJ(c20384514pX.LJJIJL(i3, true));
                return;
            }
            return;
        }
        this.LLJILJILJ.add(Integer.valueOf(i));
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLL;
        if (playbookAnchorViewModel2 == null) {
            return;
        }
        playbookAnchorViewModel2.IQ2(true, iLIZ, playbookTagInfo.tagType, false, false, new InterfaceC170900l9<C470590Icr<PlaybookFetchListResponse.ResponseData>>() { // from class: X.00lR
            @Override // X.InterfaceC170900l9
            public final void LIZ(C470590Icr<PlaybookFetchListResponse.ResponseData> c470590Icr) {
                C20441214yg.LIZIZ("PlaybookPolymerizationDialog", "clickTagInfo fetchList onSucceeded");
            }

            @Override // X.InterfaceC170900l9
            public final void onFailed(Throwable th) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("clickTagInfo fetchList onFailed ");
                sbLIZ5.append(th);
                C20441214yg.LIZIZ("PlaybookPolymerizationDialog", C2188811AlT.LIZIZ(sbLIZ5));
            }
        });
    }

    public final void LJFF(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        this.LLJILLL = view.findViewById(R.id.vg_empty);
        View viewFindViewById = view.findViewById(R.id.cw9);
        this.LLJJ = viewFindViewById;
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.14rd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int iMQ2;
                C20394514r9.LJII("click btnTryAgain");
                if (System.currentTimeMillis() - this.LL.LLJJI <= ((long) LinkMicPlaybookSetting.INSTANCE.getRetryInterval()) * 1000) {
                    C20394514r9.LJII("click btnTryAgain return as too often");
                    C766270U4b.LIZLLL(2131843160);
                    return;
                }
                this.LL.LLJJI = System.currentTimeMillis();
                int iLJ = this.LL.LJ();
                C20394514r9 c20394514r9 = this.LL;
                PlaybookAnchorViewModel playbookAnchorViewModel = c20394514r9.LLILLL;
                if (playbookAnchorViewModel != null) {
                    iMQ2 = playbookAnchorViewModel.MQ2(iLJ);
                } else {
                    iMQ2 = 0;
                }
                c20394514r9.LIZJ(false, iLJ, iMQ2, false, null);
            }
        }, viewFindViewById);
        this.LLJJIJI = view.findViewById(R.id.dux);
        this.LLJJIJIL = (C1324720kZq) view.findViewById(R.id.ll7);
        this.LLJJJJ = view.findViewById(R.id.vg_active_anim);
        this.LLJJJJJIL = (C1324720kZq) view.findViewById(R.id.l7t);
        this.LLJJJ = (C16F5) view.findViewById(R.id.tv_title);
        this.LLJJJIL = (C16F5) view.findViewById(R.id.cwj);
        this.LLJJIJIIJIL = view.findViewById(R.id.qog);
        C16F5 c16f5 = this.LLJJJIL;
        if (c16f5 != null) {
            c16f5.setBackgroundResource(R.drawable.e36);
        }
        C16F5 c16f52 = this.LLJJJIL;
        if (c16f52 != null) {
            c16f52.setTextSize(15.0f);
        }
        C16F5 c16f53 = this.LLJJJIL;
        if (c16f53 != null) {
            c16f53.setTypeface(C1119920fFW.LIZJ(15.0f, 500, view.getContext()));
        }
        C16F5 c16f54 = this.LLJJJIL;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c16f54 != null) {
            layoutParams = c16f54.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) C497740JfY.LIZIZ(64.0f);
                layoutParams.height = (int) C497740JfY.LIZIZ(32.0f);
            }
        } else {
            layoutParams = null;
        }
        C16F5 c16f55 = this.LLJJJIL;
        if (c16f55 != null) {
            C786410Ut5.y6(c16f55, layoutParams);
        }
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            layoutParams2 = view2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.height = (int) C497740JfY.LIZIZ(98.0f);
        }
        View view3 = this.LLJJIJI;
        if (view3 != null) {
            C786410Ut5.W5(view3, marginLayoutParams);
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null) {
            mutableLiveData.observeForever((Observer) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.14qu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                MutableLiveData<ActivePlaybook> mutableLiveData2;
                ActivePlaybook value;
                Playbook playbook;
                C20394514r9 c20394514r9;
                DataChannel dataChannel;
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                long j;
                EnumC20429314wl enumC20429314wlLIZ;
                C20394514r9.LJII("activePlaybook onClick");
                PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LL.LLILLL;
                if (playbookAnchorViewModel2 != null && (mutableLiveData2 = playbookAnchorViewModel2.LLILLJJLI) != null && (value = mutableLiveData2.getValue()) != null && (playbook = value.playbook) != null && (dataChannel = (c20394514r9 = this.LL).LLILLJJLI) != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
                    long j2 = playbook.playbookId;
                    PlaybookContent playbookContent = playbook.content;
                    if (playbookContent != null) {
                        j = playbookContent.playbookContentId;
                    } else {
                        j = 0;
                    }
                    C20382814pG c20382814pG = new C20382814pG(j2, j, false, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2052);
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    if (LinkMicNonMGPlaybookFixTechSwitchSetting.INSTANCE.isEnable()) {
                        enumC20429314wlLIZ = C20394214r6.LIZ(c20394514r9.LLILLL);
                    } else {
                        enumC20429314wlLIZ = null;
                    }
                    playbookAnchorServiceV2LIZIZ.LJJIFFI(c20382814pG, "PlaybookPolymerizationDialog", c915190ZvJ, enumC20429314wlLIZ, false);
                }
            }
        }, this.LLJJIJI);
    }

    public final void LJIIIZ(ActivePlaybook activePlaybook) {
        Long lValueOf;
        MutableLiveData<C1158290gFP> mutableLiveData;
        C1158290gFP value;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        String str;
        PlaybookContent playbookContent;
        PlaybookContent playbookContent2;
        Playbook playbook;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateActivePlaybookUi activePlaybook:");
        String str2 = null;
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        LJII(C2188811AlT.LIZIZ(sbLIZ));
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJJIJIIJIL) != null && (value = mutableLiveData.getValue()) != null && value.LIZJ && activePlaybook != null && activePlaybook.playbook != null && activePlaybook.playStatus == 1) {
            View view = this.LLJJIJI;
            if (view != null) {
                C500260Jjc.LJLJLJ(view, true);
            }
            C500260Jjc.LJLJLJ(this.LLJJJJ, true);
            C1143680frq.LJFF(this.LLJJJJJIL, "tiktok_live_interaction_normal_3", "ttlive_multi_guest_playbook_active_playbook_anim.webp", ImageView.ScaleType.CENTER_CROP, new C0IYA() { // from class: X.14s7
                @Override // X.C0IYA, X.InterfaceC1142670fqD
                public final void LIZLLL(String str3, Exception exc) {
                    String message;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateActivePlaybookUi ttlive_multi_guest_playbook_active_playbook_anim onLoadFailed exception:");
                    if (exc != null) {
                        message = exc.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ2.append(message);
                    C20394514r9.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.C0IYA, X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str3) {
                    C20394514r9.LJII("updateActivePlaybookUi ttlive_multi_guest_playbook_active_playbook_anim onLoadSuccess");
                }
            });
            C1324720kZq c1324720kZq = this.LLJJIJIL;
            if (c1324720kZq != null) {
                layoutParams = c1324720kZq.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.width = (int) C497740JfY.LIZIZ(40.0f);
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.height = (int) C497740JfY.LIZIZ(52.0f);
                marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(15.0f));
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(12.0f);
            }
            C1324720kZq c1324720kZq2 = this.LLJJIJIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.u6(c1324720kZq2, marginLayoutParams);
            }
            C16F5 c16f5 = this.LLJJJ;
            if (c16f5 != null) {
                layoutParams2 = c16f5.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
                }
            } else {
                marginLayoutParams2 = null;
            }
            C16F5 c16f52 = this.LLJJJ;
            if (c16f52 != null) {
                C786410Ut5.y6(c16f52, marginLayoutParams2);
            }
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            Playbook playbook2 = activePlaybook.playbook;
            if (playbook2 != null && (playbookContent2 = playbook2.content) != null) {
                str = playbookContent2.coverUrl;
            } else {
                str = null;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(ImageModel.genBy(str));
            c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(8)));
            int iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(52.0f);
            c1324610kZfLJIIIZ.LJ = iLIZIZ;
            c1324610kZfLJIIIZ.LJFF = iLIZIZ2;
            c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
            String str3 = C20399914s1.LLJJIII;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.fht;
            c1324610kZfLJIIIZ.LJIIL = new InterfaceC1142670fqD() { // from class: X.14ri
                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str4, Exception exc) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str4) {
                    final C20394514r9 c20394514r9 = this.LIZ;
                    C1324720kZq c1324720kZq3 = c20394514r9.LLJJIJIL;
                    if (c1324720kZq3 != null) {
                        HandlerHook.viewPost(c1324720kZq3, new Runnable() { // from class: X.14rE
                            public final void LIZ() {
                                C20394514r9 c20394514r92;
                                C1324720kZq c1324720kZq4;
                                C1324720kZq c1324720kZq5 = c20394514r9.LLJJIJIL;
                                GradientDrawable gradientDrawable = null;
                                if (c1324720kZq5 == null || c1324720kZq5.getParent() == null || (c1324720kZq4 = (c20394514r92 = c20394514r9).LLJJIJIL) == null) {
                                    return;
                                }
                                C20394714rB.LIZ.getClass();
                                Bitmap bitmapLIZ = C20394714rB.LIZ(c1324720kZq4);
                                if (bitmapLIZ == null) {
                                    return;
                                }
                                try {
                                    int iLIZIZ3 = C20394714rB.LIZIZ(bitmapLIZ);
                                    Drawable drawableLIZIZ = C800330VaR.LIZIZ(c1324720kZq4.getContext(), R.drawable.f7r);
                                    if ((drawableLIZIZ instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableLIZIZ) != null) {
                                        gradientDrawable.setColor(iLIZIZ3);
                                    }
                                    View view2 = c20394514r92.LLJJIJIIJIL;
                                    if (view2 != null) {
                                        C12ES.LJIILL(0, view2);
                                    }
                                    View view3 = c20394514r92.LLJJIJIIJIL;
                                    if (view3 != null) {
                                        view3.setBackground(gradientDrawable);
                                    }
                                    View view4 = c20394514r92.LLJJIJIIJIL;
                                    if (view4 != null) {
                                        C786410Ut5.T4(view4, 0.5f);
                                    }
                                    C20394714rB.LJI(bitmapLIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C20394714rB.LIZ.getClass();
                                    C20394714rB.LJI(bitmapLIZ);
                                    throw th;
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PolymerizationView@98dc.updateActivePlaybookUi$2$onLoadSuccess$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PolymerizationView@98dc.updateActivePlaybookUi$2$onLoadSuccess$1");
                            }
                        });
                    }
                }
            };
            c1324610kZfLJIIIZ.LJJI(this.LLJJIJIL);
            C16F5 c16f53 = this.LLJJJ;
            if (c16f53 != null) {
                Playbook playbook3 = activePlaybook.playbook;
                if (playbook3 != null && (playbookContent = playbook3.content) != null) {
                    str2 = playbookContent.title;
                }
                c16f53.setText(str2);
                return;
            }
            return;
        }
        View view2 = this.LLJJIJI;
        if (view2 == null) {
            return;
        }
        C500260Jjc.LJLJLJ(view2, false);
    }

    @Override // X.InterfaceC20405014sq
    public final void tq(Playbook playbook, C20402114sN c20402114sN) {
        Context contextInvoke = this.LLIZLLLIL.invoke();
        if (contextInvoke != null) {
            C20394714rB c20394714rB = C20394714rB.LIZ;
            DataChannel dataChannel = this.LLILLJJLI;
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
            C1117360fBO c1117360fBOInvoke = this.LLJ.invoke();
            PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLL;
            c20394714rB.getClass();
            C20406514t5 c20406514t5LIZJ = C20394714rB.LIZJ(playbook, c1117360fBOInvoke, playbookAnchorViewModel2);
            C20403114sX c20403114sX = new C20403114sX(this, c20402114sN);
            c20394714rB.getClass();
            C20394714rB.LJ(dataChannel, contextInvoke, playbook, playbookAnchorViewModel, c20406514t5LIZJ, null, null, c20403114sX);
        }
    }

    @Override // X.InterfaceC20405014sq
    public final void nn(Playbook playbook, boolean z, C978410bZH c978410bZH) {
        int i;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        long j;
        boolean z2;
        int iLJJIL;
        C20384514pX c20384514pX;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook2;
        int iIntValue = this.LLIZ.invoke(playbook).intValue();
        if (z) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            DataChannel dataChannel = this.LLILLJJLI;
            if (iIntValue <= 0) {
                iIntValue = 0;
            }
            int i2 = iIntValue + 1;
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
            if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null && playbook2.playbookId == playbook.playbookId) {
                z2 = true;
            } else {
                z2 = false;
            }
            PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLL;
            if (playbookAnchorViewModel2 != null && (c20384514pX = playbookAnchorViewModel2.LLJJJJJIL) != null) {
                iLJJIL = c20384514pX.LJJIL();
            } else {
                iLJJIL = 0;
            }
            i = 0;
            C978360bZC.LJIILL(dataChannel, "click", playbook, "recommend", i2, z2, false, Integer.valueOf(iLJJIL), Integer.valueOf(C20385714pj.LIZ(this.LLILLL)), 0, null, null, 3648);
        } else {
            i = 0;
        }
        String strLIZ = C01EI.LIZ(i, "PlaybookPolymerizationDialog");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemClick playbook:");
        sbLIZ.append(Long.valueOf(playbook.playbookId));
        EnumC20429314wl enumC20429314wlLIZ = null;
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        long j2 = playbook.playbookId;
        if (c978410bZH != null) {
            C978360bZC.LJJIIZ(j2, c978410bZH);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel2)) != null) {
            long j3 = playbook.playbookId;
            PlaybookContent playbookContent = playbook.content;
            if (playbookContent != null) {
                j = playbookContent.playbookContentId;
            } else {
                j = 0;
            }
            C20382814pG c20382814pG = new C20382814pG(j3, j, playbook.isUpdatedVersion, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2056);
            C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
            if (LinkMicNonMGPlaybookFixTechSwitchSetting.INSTANCE.isEnable()) {
                enumC20429314wlLIZ = C20394214r6.LIZ(this.LLILLL);
            }
            playbookAnchorServiceV2LIZIZ.LJJIFFI(c20382814pG, "PlaybookPolymerizationDialog", c915190ZvJ2, enumC20429314wlLIZ, false);
        }
    }

    public final void LIZJ(final boolean z, int i, int i2, boolean z2, final InterfaceC170900l9 interfaceC170900l9) {
        PlaybookAnchorViewModel playbookAnchorViewModel;
        boolean z3 = this.LLJILJIL;
        C20385714pj.LIZ(this.LLILLL);
        InterfaceC170900l9<C470590Icr<PlaybookFetchListResponse.ResponseData>> interfaceC170900l92 = new InterfaceC170900l9<C470590Icr<PlaybookFetchListResponse.ResponseData>>() { // from class: X.14qe
            @Override // X.InterfaceC170900l9
            public final void LIZ(C470590Icr<PlaybookFetchListResponse.ResponseData> c470590Icr) {
                boolean zLJI;
                boolean zLJI2;
                ActivePlaybook value;
                MutableLiveData<ActivePlaybook> mutableLiveData;
                final C470590Icr<PlaybookFetchListResponse.ResponseData> c470590Icr2 = c470590Icr;
                C20394514r9.LJII("fetchList success");
                this.LIZ.LLILZ.invoke(Boolean.FALSE);
                Function1<Boolean, Unit> function1 = this.LIZ.LLILZIL;
                MultiGuestPlaybookUEOptSetting multiGuestPlaybookUEOptSetting = MultiGuestPlaybookUEOptSetting.INSTANCE;
                if (multiGuestPlaybookUEOptSetting.isEnable()) {
                    zLJI = false;
                } else {
                    C20394514r9 c20394514r9 = this.LIZ;
                    PlaybookFetchListResponse.ResponseData responseData = c470590Icr2.data;
                    c20394514r9.getClass();
                    zLJI = C20394514r9.LJI(responseData);
                }
                function1.invoke(Boolean.valueOf(zLJI));
                View view = this.LIZ.LLJILLL;
                if (multiGuestPlaybookUEOptSetting.isEnable()) {
                    zLJI2 = false;
                } else {
                    C20394514r9 c20394514r92 = this.LIZ;
                    PlaybookFetchListResponse.ResponseData responseData2 = c470590Icr2.data;
                    c20394514r92.getClass();
                    zLJI2 = C20394514r9.LJI(responseData2);
                }
                C500260Jjc.LJLJLJ(view, zLJI2);
                C20394514r9 c20394514r93 = this.LIZ;
                if (c20394514r93.LLJI) {
                    c20394514r93.LLJI = false;
                    Handler handlerLIZ = C1870470ym5.LIZ();
                    final C20394514r9 c20394514r94 = this.LIZ;
                    C786410Ut5.LJJZZIII(handlerLIZ, new Runnable() { // from class: X.01rd
                        public final void LIZ() {
                            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                            DataChannel dataChannel = c20394514r94.LLILLJJLI;
                            boolean z4 = !c470590Icr2.data.favoritePlaybooks.isEmpty();
                            long jCurrentTimeMillis = System.currentTimeMillis() - c20394514r94.LLJJJJLIIL;
                            PlaybookFetchListResponse.ResponseData responseData3 = c470590Icr2.data;
                            C978360bZC.LJIILLIIL(dataChannel, z4, jCurrentTimeMillis, responseData3.currentRecommendedTagType, responseData3.currentRecommendedFirstLevelTagType, responseData3.tagAggregations, null, null, null, 448);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PolymerizationView@98dc.fetchList$callback$1$onSucceeded$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PolymerizationView@98dc.fetchList$callback$1$onSucceeded$1");
                        }
                    });
                }
                if (!c470590Icr2.data.favoritePlaybooks.isEmpty()) {
                    C20394514r9 c20394514r95 = this.LIZ;
                    if (c20394514r95.LLJIJIL) {
                        c20394514r95.LLJIJIL = false;
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("anchor_id", String.valueOf(C933980aPc.LIZIZ()));
                        linkedHashMap.put("action_type", "show");
                        C978360bZC.LJJIIZI("livesdk_multi_anchor_playbook_favorites_module", linkedHashMap);
                    }
                }
                if (!z) {
                    C20394514r9 c20394514r96 = this.LIZ;
                    PlaybookAnchorViewModel playbookAnchorViewModel2 = c20394514r96.LLILLL;
                    if (playbookAnchorViewModel2 != null && (mutableLiveData = playbookAnchorViewModel2.LLILLJJLI) != null) {
                        value = mutableLiveData.getValue();
                    } else {
                        value = null;
                    }
                    c20394514r96.LJIIIZ(value);
                }
                InterfaceC170900l9<C470590Icr<PlaybookFetchListResponse.ResponseData>> interfaceC170900l93 = interfaceC170900l9;
                if (interfaceC170900l93 != null) {
                    interfaceC170900l93.LIZ(c470590Icr2);
                }
            }

            @Override // X.InterfaceC170900l9
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchList onFailed t:");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C20394514r9.LJII(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LLILZ.invoke(Boolean.FALSE);
                this.LIZ.LLILZLL.invoke(C13BV.INSTANCE, "fetchList_onFailed");
                this.LIZ.LLILZIL.invoke(Boolean.TRUE);
                C500260Jjc.LJLJLJ(this.LIZ.LLJILLL, true);
                this.LIZ.LJIIIZ(null);
                InterfaceC170900l9<C470590Icr<PlaybookFetchListResponse.ResponseData>> interfaceC170900l93 = interfaceC170900l9;
                if (interfaceC170900l93 != null) {
                    interfaceC170900l93.onFailed(th);
                }
            }
        };
        this.LLJILJIL = false;
        int i3 = C20391514qf.LIZ[this.LL.ordinal()];
        if (i3 != 1) {
            if (i3 == 2 && (playbookAnchorViewModel = this.LLILLL) != null) {
                playbookAnchorViewModel.LLJJJ = i;
                playbookAnchorViewModel.IQ2(z, i, i2, z3, z2, interfaceC170900l92);
                return;
            }
            return;
        }
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLL;
        if (playbookAnchorViewModel2 == null) {
            return;
        }
        playbookAnchorViewModel2.IQ2(z, 2, i2, z3, false, interfaceC170900l92);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20394514r9(EnumC20429314wl enumC20429314wl, DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12, Function2<? super List<Playbook>, ? super String, Unit> function2, Function1<? super Playbook, Integer> function13, Function0<? extends Context> function0, Function0<? extends C1117360fBO> function02) {
        int iLJJIL;
        MutableLiveData<C1158290gFP> mutableLiveData;
        MutableLiveData<List<Playbook>> mutableLiveData2;
        C20384514pX c20384514pX;
        this.LL = enumC20429314wl;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = playbookAnchorViewModel;
        this.LLILZ = function1;
        this.LLILZIL = function12;
        this.LLILZLL = function2;
        this.LLIZ = function13;
        this.LLIZLLLIL = function0;
        this.LLJ = function02;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LLJILJILJ = linkedHashSet;
        this.LLJJIII = true;
        this.LLJJJJLIIL = System.currentTimeMillis();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C20401814sK(this));
        this.LLJJL = c01gwLIZIZ;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C20403314sZ(this));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C20401714sJ(this));
        this.LLJL = c01gwLIZIZ2;
        function1.invoke(Boolean.TRUE);
        if (MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable() && playbookAnchorViewModel != null && (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) != null) {
            iLJJIL = c20384514pX.LJJIL();
        } else {
            iLJJIL = 0;
        }
        linkedHashSet.add(Integer.valueOf(iLJJIL));
        if (playbookAnchorViewModel != null && (mutableLiveData2 = playbookAnchorViewModel.LLJILLL) != null) {
            mutableLiveData2.observeForever((Observer) c01gwLIZIZ.getValue());
        }
        if (dataChannel != null) {
            dataChannel.CQ2(PlaybookLoadFetchListEvent.class, this, new C20397714rf(this));
        }
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJJIJIIJIL) != null) {
            mutableLiveData.observeForever((Observer) c01gwLIZIZ2.getValue());
        }
    }
}
