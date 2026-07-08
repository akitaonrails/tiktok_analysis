package X;

import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.silent.ShareSelectorPanelFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS99S0100000_33;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1A3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173161A3e extends C2173181A3g {
    public View LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public Integer LLJJIJIL;
    public final HashMap<Integer, List<InterfaceC21459018yS>> LLJJJ;
    public final BPEAHandler LLJJJIL;
    public ShareSelectorPanelFragment LLJJJJ;

    @Override // X.C2173181A3g
    public int getLayoutResId() {
        return R.layout.f7z;
    }

    public static final boolean LJJI() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        return iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableUseShareSheet();
    }

    public final void LJJIFFI() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = this.LLJJIJIL != null ? R.raw.icon_x_mark : R.raw.icon_chevron_right_slim_thin_ltr;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        if (this.LLJJIJIL != null) {
            TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
            if (tuxIconView2 != null && (layoutParams4 = tuxIconView2.getLayoutParams()) != null) {
                layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            TuxIconView tuxIconView3 = this.LLJJIJIIJIL;
            if (tuxIconView3 != null && (layoutParams3 = tuxIconView3.getLayoutParams()) != null) {
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            TuxTextView tuxTextView = this.LLJJIJI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
        } else {
            TuxIconView tuxIconView4 = this.LLJJIJIIJIL;
            if (tuxIconView4 != null && (layoutParams2 = tuxIconView4.getLayoutParams()) != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            TuxIconView tuxIconView5 = this.LLJJIJIIJIL;
            if (tuxIconView5 != null && (layoutParams = tuxIconView5.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            TuxTextView tuxTextView2 = this.LLJJIJI;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        }
        TuxIconView tuxIconView6 = this.LLJJIJIIJIL;
        if (tuxIconView6 != null) {
            tuxIconView6.requestLayout();
        }
        List<EnumC1377930lxf> channels = getChannels();
        if (channels == null || channels.size() <= 0) {
            TuxTextView tuxTextView3 = this.LLJJIJI;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                return;
            }
            return;
        }
        for (EnumC1377930lxf enumC1377930lxf : channels) {
            int saveType = enumC1377930lxf.getSaveType();
            Integer num = this.LLJJIJIL;
            if (num != null && saveType == num.intValue()) {
                TuxTextView tuxTextView4 = this.LLJJIJI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(enumC1377930lxf.getLabel());
                }
                TuxTextView tuxTextView5 = this.LLJJIJI;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
            }
        }
    }

    public final List<EnumC1377930lxf> getChannels() {
        ArrayList arrayList = new ArrayList();
        if (LJIJ()) {
            arrayList.add(EnumC1377930lxf.LINE);
        }
        if (LJIJI()) {
            arrayList.add(EnumC1377930lxf.MESSENGER);
        }
        EnumC1377930lxf enumC1377930lxf = EnumC1377930lxf.SAVE_LOCAL;
        enumC1377930lxf.setLabel(getContext().getString(2131830004));
        arrayList.add(enumC1377930lxf);
        return arrayList;
    }

    public final long getSharePanelDismissDuration() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService != null) {
            return iAVPublishPageUIRefactorService.getSharePanelDismissDuration();
        }
        return 0L;
    }

    @Override // X.C2173181A3g, X.AbstractC855590XhN
    public int getSaveUploadType() {
        EnumC1377930lxf next;
        if (!LJJI()) {
            return super.getSaveUploadType();
        }
        Iterator<EnumC1377930lxf> it2 = getChannels().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int saveType = next.getSaveType();
            Integer num = this.LLJJIJIL;
            if (num != null && saveType == num.intValue()) {
                break;
            }
        }
        EnumC1377930lxf enumC1377930lxf = next;
        if (enumC1377930lxf != null) {
            return enumC1377930lxf.getSaveType();
        }
        return 0;
    }

    public C2173161A3e(Context context) {
        super(context);
        this.LLJJJ = new HashMap<>();
        this.LLJJJIL = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0DLU
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                DialogFragment dialogFragment;
                if (message.what == 1) {
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    if ((messageObj instanceof TuxSheet) && (dialogFragment = (DialogFragment) messageObj) != null) {
                        dialogFragment.dismiss();
                    }
                }
                return true;
            }
        });
    }

    @Override // X.C2173181A3g, X.AbstractC855590XhN
    public final void LIZJ(int i) {
        EnumC1377930lxf next;
        int i2;
        TuxTextView tuxTextView;
        super.LIZJ(i);
        if (i == 1) {
            Integer num = this.LLJJIJIL;
            int saveType = EnumC1377930lxf.SAVE_LOCAL.getSaveType();
            if ((num == null || num.intValue() != saveType) && (tuxTextView = this.LLJJIJI) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        if (this.LLJJIJIL == null) {
            return;
        }
        Iterator<EnumC1377930lxf> it2 = getChannels().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                int saveType2 = next.getSaveType();
                Integer num2 = this.LLJJIJIL;
                if (num2 != null && saveType2 == num2.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1377930lxf enumC1377930lxf = next;
        if (enumC1377930lxf != null) {
            C1238740iLA.LIZ().LJ("key_silent_share_save", enumC1377930lxf.getSaveType());
            TuxTextView tuxTextView2 = this.LLJJIJI;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        }
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (enumC1377930lxf != null) {
            i2 = R.raw.icon_x_mark_small;
        } else {
            i2 = R.raw.icon_chevron_right_slim_thin_ltr;
        }
        c419910GdJ.LIZ = i2;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    @Override // X.C2173181A3g, X.AbstractC855590XhN
    public final void LJIIIZ(boolean z) {
        Integer num;
        if (LJJI()) {
            if (!z && (num = this.LLJJIJIL) != null && num.intValue() == 1) {
                TuxTextView tuxTextView = this.LLJJIJI;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                this.LLJJIJIL = null;
            }
            LJJIFFI();
            ShareSelectorPanelFragment shareSelectorPanelFragment = this.LLJJJJ;
            if (shareSelectorPanelFragment != null) {
                shareSelectorPanelFragment.OR(z);
                return;
            }
            return;
        }
        super.LJIIIZ(z);
    }

    @Override // X.C2173181A3g
    public final void LJIILLIIL(View view) {
        ShareSelectorPanelFragment shareSelectorPanelFragment;
        EnumC1377930lxf next;
        boolean zTurnOffSaveLocalOptionByDefault;
        IAVPublishService iAVPublishServicePublishService;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.uzg);
        if (tuxIconView != null && (iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null)) != null && iAVPublishPageUIRefactorService.enableRefactorPublishUI()) {
            tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        }
        if (LJJI()) {
            View viewFindViewById = view.findViewById(R.id.uzg);
            if (viewFindViewById != null) {
                C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 17);
            }
            this.LLJJIII = view.findViewById(R.id.mf0);
            this.LLJJIJI = (TuxTextView) view.findViewById(R.id.umj);
            this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.uma);
            View view2 = this.LLJJIII;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, new ACListenerS167S0100000_33(this, 112));
            }
            View viewFindViewById2 = view.findViewById(R.id.spl);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
            C786410Ut5.I7(new AkS99S0100000_33(this, 6), view);
            if (LJIILJJIL() && LJIILIIL()) {
                C19259110Wf c19259110Wf = C746350TPl.LIZ;
                Integer numLIZ = c19259110Wf.LIZIZ().LIZ();
                if (numLIZ != null) {
                    if (numLIZ.intValue() == 1) {
                        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                        if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
                            zTurnOffSaveLocalOptionByDefault = iAVPublishServicePublishService.turnOffSaveLocalOptionByDefault();
                        } else {
                            zTurnOffSaveLocalOptionByDefault = false;
                        }
                        C01GW c01gw = C604730Nnj.LIZ;
                        Keva keva = (Keva) c01gw.getValue();
                        C01GW c01gw2 = C604730Nnj.LIZJ;
                        boolean z = keva.getBoolean((String) c01gw2.getValue(), false);
                        if (zTurnOffSaveLocalOptionByDefault && !z) {
                            ((Keva) c01gw.getValue()).storeBoolean((String) c01gw2.getValue(), true);
                            c19259110Wf.LIZIZ().LJ(0);
                        } else {
                            this.LLJJIJIL = Integer.valueOf(EnumC1377930lxf.SAVE_LOCAL.getSaveType());
                        }
                    } else if (numLIZ.intValue() == 11) {
                        if (!LJIJ()) {
                            c19259110Wf.LIZIZ().LJ(0);
                        } else {
                            this.LLJJIJIL = Integer.valueOf(EnumC1377930lxf.LINE.getSaveType());
                        }
                    } else if (numLIZ.intValue() == 7) {
                        if (!LJIJI()) {
                            c19259110Wf.LIZIZ().LJ(0);
                        } else {
                            this.LLJJIJIL = Integer.valueOf(EnumC1377930lxf.MESSENGER.getSaveType());
                        }
                    }
                }
                if (this.LLJJIJIL != null && (shareSelectorPanelFragment = this.LLJJJJ) != null) {
                    Iterator<EnumC1377930lxf> it2 = getChannels().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            int saveType = next.getSaveType();
                            Integer num = this.LLJJIJIL;
                            if (num != null && saveType == num.intValue()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    shareSelectorPanelFragment.NR(next);
                }
                LJJIFFI();
                return;
            }
            return;
        }
        View viewFindViewById3 = view.findViewById(R.id.spl);
        if (viewFindViewById3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById3);
    }

    @Override // X.C2173181A3g
    public final void LJIIZILJ(View view) {
        TextView textView = (TextView) view.findViewById(R.id.v1t);
        if (textView != null) {
            textView.setMaxLines(1);
        }
    }

    @Override // X.C2173181A3g
    public final void LJIJJLI(int i) {
        String string;
        TuxTextView tuxTextView = (TuxTextView) getRootView().findViewById(R.id.uyz);
        if (tuxTextView != null) {
            if (i == this.LLILZLL.getId()) {
                string = tuxTextView.getContext().getString(2131848257);
            } else if (i == this.LLIZ.getId()) {
                string = "Line";
            } else if (i == this.LLIZLLLIL.getId()) {
                string = "Messenger";
            } else {
                string = tuxTextView.getContext().getString(2131848256);
            }
            tuxTextView.setText(string);
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    @Override // X.C2173181A3g
    public void setSilentShareChannelDrawable(Context context) {
        this.LLJILJILJ = 36;
        this.LLJILLL = 22;
        super.setSilentShareChannelDrawable(context);
    }

    @Override // X.C2173181A3g, X.AbstractC855590XhN
    public final void LIZ(int i, C855810Xhj c855810Xhj) {
        LinearLayout linearLayout;
        super.LIZ(i, c855810Xhj);
        if (LJJI()) {
            HashMap<Integer, List<InterfaceC21459018yS>> map = this.LLJJJ;
            Integer numValueOf = Integer.valueOf(i);
            List<InterfaceC21459018yS> arrayList = map.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(numValueOf, arrayList);
            }
            arrayList.add(c855810Xhj);
            Integer num = this.LLJJIJIL;
            if (num != null && num.intValue() == i && (linearLayout = this.LLILZ) != null && !c855810Xhj.LIZ(linearLayout)) {
                TuxTextView tuxTextView = this.LLJJIJI;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                this.LLJJIJIL = null;
            }
        }
    }
}
