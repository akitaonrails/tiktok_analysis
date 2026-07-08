package X;

import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15QK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QK extends C19A3 {
    public static AwS566S0100000_22 LLLLIL;
    public MutableLiveData<InfoStickerModel> LLJILLL;
    public VideoPublishEditModel LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public C19A3 LLJJIJI;
    public C1441830ncj LLJJIJIIJIL;
    public C15QI LLJJJ;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public TuxSheet LLJJL;
    public C998630c5t LLJJLIIIJLLLLLLLZ;
    public C1748440vbG LLLILZLLLI;
    public boolean LLLJ;
    public C1DRG LLLJIL;
    public C0LI2 LLLJL;
    public ViewGroup LLLL;
    public C15QD LLLLII;
    public final C16HQ LLLLIIIILLL;
    public final C857020Xjg LLLLIIL;
    public final C15QL LLLLIILL;
    public boolean LLLLIILLL;
    public List<PUgcSlotData> LLJJIJIL = new ArrayList();
    public final Map<Integer, Set<Integer>> LLJJJIL = new LinkedHashMap();
    public final C15QM LLJJJJLIIL = new C15QM();
    public boolean LLJL = true;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1044));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1027));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1036));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1023));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1021));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1022));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1024));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1039));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1037));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1031));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1030));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1043));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1032));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1038));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1026));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1025));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1028));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1033));
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1042));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1034));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1029));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1041));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1040));

    public final boolean LLLLIIIILLL() {
        Integer num;
        List<PUgcSlotData> list = this.LLJJIJIL;
        ArrayList arrayList = new ArrayList();
        for (PUgcSlotData pUgcSlotData : list) {
            if (true ^ pUgcSlotData.isFixed) {
                arrayList.add(pUgcSlotData);
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJJ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel.creativeModel.publishModel.bindFreezeFrameSlot) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                PUgcSlotData pUgcSlotData2 = (PUgcSlotData) obj;
                int iIndexOf = this.LLJJIJIL.indexOf(pUgcSlotData2);
                if (pUgcSlotData2.LIZ()) {
                    Iterator it2 = ((LinkedHashMap) this.LLJJJIL).entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (((Set) entry.getValue()).contains(Integer.valueOf(iIndexOf)) && (num = (Integer) entry.getKey()) != null) {
                            if (!arrayList.contains(ListProtector.get(this.LLJJIJIL, num.intValue()))) {
                            }
                        }
                    }
                }
                arrayList2.add(obj);
            }
            arrayList = arrayList2;
        }
        return arrayList.size() != 1 && this.LLJJIJIL.size() > 0;
    }

    public final C0HZQ LLLLILI() {
        return (C0HZQ) this.LLLIIIIL.getValue();
    }

    public final TuxIconView LLLLJ() {
        return (TuxIconView) this.LLLFF.getValue();
    }

    public final ViewGroup LLLLJI() {
        return (ViewGroup) this.LLLIILIL.getValue();
    }

    public final RecyclerView LLLLL() {
        return (RecyclerView) this.LLLFZ.getValue();
    }

    public final C21411818qq LLLLLIL() {
        return (C21411818qq) this.LLJLLL.getValue();
    }

    public final boolean LLLLLJIL() {
        List<PUgcSlotData> list = this.LLJJIJIL;
        ArrayList arrayList = new ArrayList();
        for (PUgcSlotData pUgcSlotData : list) {
            if (true ^ pUgcSlotData.isFixed) {
                arrayList.add(pUgcSlotData);
            }
        }
        return this.LLJJIJIL.size() >= 1 && arrayList.size() == this.LLJJIJIL.size();
    }

    public final boolean LLLLLJLJLL() {
        List<PUgcSlotData> list = this.LLJJIJIL;
        ArrayList arrayList = new ArrayList();
        for (PUgcSlotData pUgcSlotData : list) {
            if (true ^ pUgcSlotData.isFixed) {
                arrayList.add(pUgcSlotData);
            }
        }
        return this.LLJJIJIL.size() >= 1 && arrayList.size() == 0;
    }

    public final void LLLLLLLLL() {
        View viewFindViewById = this.mView.findViewById(R.id.v_separator);
        boolean z = true;
        if (LLLLJI().getVisibility() != 0 && ((View) this.LLLIZZ.getValue()).getVisibility() != 0) {
            z = false;
        }
        C375780EoK.LIZIZ(viewFindViewById, z);
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [X.15QL] */
    public C15QK() {
        new C11RK();
        this.LLLLIIIILLL = new C16HQ(this, 2);
        this.LLLLIIL = C857020Xjg.LL;
        this.LLLLIILL = new InputFilter.LengthFilter() { // from class: X.15QL
            {
                super(90);
            }

            @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                int length;
                if (spanned != null) {
                    length = spanned.length();
                } else {
                    length = 0;
                }
                int i5 = 90 - (length - (i4 - i3));
                if (i5 >= i2 - i) {
                    return null;
                }
                if (i5 <= 0) {
                    C15QK c15qk = this.LL;
                    c15qk.bu(c15qk.getString(2131850020));
                    return "";
                }
                int i6 = i5 + i;
                if (Character.isHighSurrogate(charSequence.charAt(i6 - 1)) && i6 - 1 == i) {
                    C15QK c15qk2 = this.LL;
                    c15qk2.bu(c15qk2.getString(2131850020));
                    return "";
                }
                C15QK c15qk3 = this.LL;
                c15qk3.bu(c15qk3.getString(2131850020));
                return charSequence.subSequence(i, i6);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLJ() {
        /*
            r8 = this;
            boolean r0 = X.C298900Bnc.LIZ()
            r7 = 0
            if (r0 == 0) goto L33
            X.0vbG r0 = r8.LLLILZLLLI
            if (r0 == 0) goto L17
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L19
        L17:
            java.lang.String r0 = ""
        L19:
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 == 0) goto L33
        L1f:
            X.01GW r0 = r8.LLL
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r7 == 0) goto L2f
            r0 = 1065353216(0x3f800000, float:1.0)
        L2b:
            X.C786410Ut5.B5(r1, r0)
            return
        L2f:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            goto L2b
        L33:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData> r0 = r8.LLJJIJIL
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L44:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 < 0) goto L7c
            com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData r2 = (com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData) r2
            boolean r0 = r2.isFixed
            if (r0 == 0) goto L64
            java.lang.String r0 = r2.uuid
            r6.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.add(r0)
        L64:
            r3 = r1
            goto L44
        L66:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData> r0 = r8.LLJJIJIL
            int r0 = r0.size()
            if (r0 <= 0) goto L7a
            int r1 = r6.size()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData> r0 = r8.LLJJIJIL
            int r0 = r0.size()
            if (r1 == r0) goto L1f
        L7a:
            r7 = 1
            goto L1f
        L7c:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15QK.LLLLLLJ():void");
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C1441830ncj c1441830ncj = this.LLJJIJIIJIL;
        if (c1441830ncj == null) {
            c1441830ncj = null;
        }
        c1441830ncj.LIZJ();
        this.LLJJJJ = false;
        C15QD c15qd = this.LLLLII;
        if (c15qd == null) {
            c15qd = null;
        }
        Iterator<Map.Entry<String, C1323050kX9<AbstractC1327750kej>>> it2 = c15qd.LLILZLL.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().close();
        }
        c15qd.LLILZLL.clear();
        LLLLIL = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLJJJJJIL = true;
        C1441830ncj c1441830ncj = this.LLJJIJIIJIL;
        if (c1441830ncj == null) {
            c1441830ncj = null;
        }
        c1441830ncj.LIZLLL();
        C786410Ut5.LLLLLLZZ(LLLLJ(), 0);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLJJJJJIL && this.LLJJJJ) {
            C1441830ncj c1441830ncj = this.LLJJIJIIJIL;
            (c1441830ncj != null ? c1441830ncj : null).LJ();
            C786410Ut5.LLLLLLZZ(LLLLJ(), 4);
            this.LLJJJJ = true;
        } else if (LLLLLIL().isChecked()) {
            C1441830ncj c1441830ncj2 = this.LLJJIJIIJIL;
            (c1441830ncj2 != null ? c1441830ncj2 : null).LJ();
            C786410Ut5.LLLLLLZZ(LLLLJ(), 4);
            this.LLJJJJ = true;
        } else {
            if (!this.LLJJJJJIL) {
                C1441830ncj c1441830ncj3 = this.LLJJIJIIJIL;
                InterfaceC1452170ntP interfaceC1452170ntP = (c1441830ncj3 != null ? c1441830ncj3 : null).LJIIIZ;
                if (interfaceC1452170ntP != null) {
                    interfaceC1452170ntP.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
            C786410Ut5.LLLLLLZZ(LLLLJ(), 0);
            this.LLJJJJ = false;
        }
        if (this.LLJL) {
            this.LLJL = false;
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                LLLLLLIL(sceneContext, false);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        Window window;
        super.onStart();
        C497270Jen.LJ(this.mActivity, true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, requireActivity());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            Activity activity = this.mActivity;
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.setNavigationBarColor(iIntValue);
        }
    }

    public static Map LLLLLL(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Pair<String, Long> pair = ((PUgcSlotData) obj).fd;
            Object arrayList = linkedHashMap.get(pair);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(pair, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    public final void LLLLIILL(boolean z) {
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LLJJ;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        VideoPublishEditModel videoPublishEditModel3 = this.LLJJ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c0lab.LJ("creation_id", videoPublishEditModel3.getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        VideoPublishEditModel videoPublishEditModel4 = this.LLJJ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c0lab.LJ("shoot_way", videoPublishEditModel4.mShootWay);
        c0lab.LIZ(z ? 1 : 0, "to_status");
        VideoPublishEditModel videoPublishEditModel5 = this.LLJJ;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel5));
        VideoPublishEditModel videoPublishEditModel6 = this.LLJJ;
        if (videoPublishEditModel6 != null) {
            videoPublishEditModel2 = videoPublishEditModel6;
        }
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel2));
        C20684815ws.LJIILLIIL("select_all_slot_template", c0lab.LIZ);
    }

    public final List<Integer> LLLLIL(int i) {
        if (((PUgcSlotData) ListProtector.get(this.LLJJIJIL, i)).LIZ()) {
            for (Map.Entry entry : ((LinkedHashMap) this.LLJJJIL).entrySet()) {
                if (((Set) entry.getValue()).contains(Integer.valueOf(i))) {
                    ArrayList arrayList = new ArrayList((Collection) entry.getValue());
                    arrayList.add(entry.getKey());
                    arrayList.remove(Integer.valueOf(i));
                    return arrayList;
                }
            }
            return null;
        }
        Set set = (Set) ((LinkedHashMap) this.LLJJJIL).get(Integer.valueOf(i));
        if (set == null) {
            return null;
        }
        return new ArrayList(set);
    }

    public final int LLLLLILLIL(String str) {
        if (C2093608Ic.LJ(a0.LJLIIIL(str).toString())) {
            return -1;
        }
        if (str.length() > 90) {
            return -2;
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJJ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        videoPublishEditModel.creativeModel.pugcTemplateData.templateTitle = str;
        return 0;
    }

    public final void LLLLLLL(boolean z) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        View view = (View) this.LLLF.getValue();
        if (z) {
            i = 8;
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zb, requireActivity());
            if (numLIZJ != null) {
                ((View) this.LLLF.getValue()).setBackgroundColor(numLIZJ.intValue());
            }
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view);
        ((View) this.LLLI.getValue()).setEnabled(z);
        View view2 = (View) this.LLJLILLLLZIIL.getValue();
        float f8 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        C786410Ut5.T4(view2, f);
        ((View) this.LLJLILLLLZIIL.getValue()).setEnabled(z);
        TuxTextView tuxTextView = (TuxTextView) this.LLJLL.getValue();
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.4f;
        }
        C786410Ut5.B5(tuxTextView, f2);
        ((TextView) this.LLJLL.getValue()).setEnabled(z);
        RecyclerView recyclerViewLLLLL = LLLLL();
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.4f;
        }
        C786410Ut5.d5(recyclerViewLLLLL, f3);
        LLLLL().setEnabled(z);
        LLLLILI().setEnabled(z);
        C0HZQ c0hzqLLLLILI = LLLLILI();
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.4f;
        }
        C786410Ut5.y5(c0hzqLLLLILI, f4);
        TuxTextView tuxTextView2 = (TuxTextView) this.LLLIIII.getValue();
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = 0.4f;
        }
        C786410Ut5.B5(tuxTextView2, f5);
        TuxTextView tuxTextView3 = (TuxTextView) this.LLLIIIL.getValue();
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = 0.4f;
        }
        C786410Ut5.B5(tuxTextView3, f6);
        LLLLJI().setEnabled(z);
        ViewGroup viewGroupLLLLJI = LLLLJI();
        if (z) {
            f7 = 1.0f;
        } else {
            f7 = 0.4f;
        }
        C786410Ut5.R4(f7, viewGroupLLLLJI);
        ((View) this.LLLIZZ.getValue()).setEnabled(z);
        ViewGroup viewGroup = (ViewGroup) this.LLLIZZ.getValue();
        if (!z) {
            f8 = 0.4f;
        }
        C786410Ut5.R4(f8, viewGroup);
    }

    public final void bu(String str) {
        Context contextRequireSceneContext = requireSceneContext();
        if (contextRequireSceneContext != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(str);
            C1390380mHk.LIZJ(contextRequireSceneContext, 6008, creativeToastBuilder);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15QK.onActivityCreated(android.os.Bundle):void");
    }

    public final void LLLLLLIL(Context context, boolean z) {
        if ((z || !this.LLJJJJLIIL.LIZ.getBoolean("pugc_guidance_has_shown", false)) && !C545820Lau.LJ(this)) {
            this.LLJJJJLIIL.LIZ.storeBoolean("pugc_guidance_has_shown", true);
            if (this.LLJJL == null) {
                C998630c5t c998630c5t = new C998630c5t(context);
                c998630c5t.setExitListener(new AwS575S0100000_31(this, 1035));
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                int iLIZLLL = (int) (((double) C11VU.LIZLLL(getSceneContext())) * 0.8d);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJL = iLIZLLL;
                tuxSheet.LLJJIII = c998630c5t;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJIIJIL = true;
                tuxSheet2.LL = new C16HF(this, 0);
                this.LLJJL = tuxSheet2;
                this.LLJJLIIIJLLLLLLLZ = c998630c5t;
            }
            this.LLLLIILLL = false;
            if (this.LLJJJJ) {
                C1441830ncj c1441830ncj = this.LLJJIJIIJIL;
                if (c1441830ncj == null) {
                    c1441830ncj = null;
                }
                c1441830ncj.LIZLLL();
                this.LLJJJJ = false;
                this.LLLLIILLL = true;
            }
            TuxSheet tuxSheet3 = this.LLJJL;
            if (tuxSheet3 != null) {
                tuxSheet3.show(C20622515mp.LJIILL((C19EG) this.mActivity, this), "PugcEditGuidancePopUpView");
            }
            C12WG.LIZJ(this, new ARunnableS116S0100000_16(this, 77));
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final void dispatchOnPreSceneDestroyed(Scene scene, boolean z) {
        super.dispatchOnPreSceneDestroyed(scene, z);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = this.LLLL;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            C16HN c16hn = new C16HN(this, 2);
            viewTreeObserver.addOnGlobalLayoutListener(c16hn);
            C2187701Ajg.LIZ(viewTreeObserver, c16hn, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ek6, viewGroup, false);
        this.LLLL = viewGroup2;
        return viewGroup2;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
