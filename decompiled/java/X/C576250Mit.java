package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576250Mit implements InterfaceC379610EuV {
    public static final C0MOG LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final View LL;
    public final LifecycleOwner LLILLJJLI;
    public final ForwardMedia LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final C1DRG LLILZLL;
    public final Map<String, List<Function1<C0LAB, Unit>>> LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final List<Integer> LLJ;
    public final C1664750tQH LLJI;
    public final C1664750tQH LLJIJIL;
    public final C0RFT LLJILJIL = StickerContainerService.LIZ().LJIJI();
    public final FrameLayout LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final C576270Miv LLJJIII;
    public List<TextStickerModel> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C576250Mit.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C576250Mit.class, "onThisDayStickerStateGlobal", "getOnThisDayStickerStateGlobal()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/component/sticker/styles/OnThisDayStickerStateGlobal;", 0)};
        LLJJIJIIJIL = new C0MOG();
    }

    public final void LIZIZ() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.getContext());
        if (c19egLIZIZ != null) {
            this.LLJILJIL.LIZJ(new C19591211ks(EnumC19589411ka.PREVIEW, this.LLJILJILJ, new C19592311l3(this.LLILZ, this.LLILZIL, 28), c19egLIZIZ, null, null, null, null, AFwS239S0000000_8.get$arr$(289), AFwS239S0000000_8.get$arr$(290), false, this.LLILLJJLI, null, null, 13552));
        }
        this.LLJILJILJ.setOnTouchListener(new View.OnTouchListener() { // from class: X.0UFp
            public final VelocityTracker LL = VelocityTracker.obtain();
            public final int LLILLJJLI;

            {
                this.LLILLJJLI = ViewConfiguration.get(this.LLILLL.LL.getContext()).getScaledMinimumFlingVelocity();
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Function0<Unit> function0;
                if (motionEvent == null) {
                    return false;
                }
                this.LL.addMovement(motionEvent);
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 3) {
                        this.LL.clear();
                        return false;
                    }
                } else {
                    this.LL.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                    if (this.LL.getXVelocity() < this.LLILLJJLI && this.LL.getYVelocity() < this.LLILLJJLI && motionEvent.getX() >= 0.0f && motionEvent.getY() >= 0.0f && (function0 = this.LLILLL.LLIZLLLIL) != null) {
                        function0.invoke();
                    }
                    this.LL.clear();
                }
                return true;
            }
        });
        this.LLJJIII.LIZLLL.LIZ(new C2217381BqS() { // from class: X.0MSb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C576280Miw) obj).LIZ);
            }
        }).LJIIIZ(this.LLILLJJLI, Lifecycle.State.CREATED, new AwS587S0100000_8(this, 647));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        TextStickerModel textStickerModel;
        Iterator<View> it2 = this.LLJILJIL.LIZ().iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            int i = 0;
            if (!c09re.hasNext()) {
                C1664750tQH c1664750tQH = this.LLJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
                ((VideoPublishEditModel) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).creativeModel.onThisDayData.setTextStyle(((C576280Miw) this.LLJJIII.LIZLLL.LIZ).LIZ);
                List<TextStickerModel> list = ((VideoPublishEditModel) this.LLJI.getValue(this, interfaceC2217461BqaArr[0])).creativeModel.stickerModel.textStickerModels;
                list.clear();
                list.addAll(this.LLJJIJI);
                return;
            }
            View view = (View) c09re.next();
            if (view instanceof C385340F8y) {
                Iterator<TextStickerModel> it3 = this.LLJJIJI.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (!Intrinsics.LJFF(String.valueOf(C2204961BRm.G((C385340F8y) view, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0EJ4beGbBtQ9pEd6MSGbtBLdTsrdFCoCBjIwxxLU1WoPUtl8VpeOeBVb5Bjqkmv4G9u+x/sYqddIVCuLBZlkFriNP/0GW+hmSghxMfw==", null))), it3.next().getTextStr())) {
                            i++;
                        } else if (i >= 0 && (textStickerModel = (TextStickerModel) C13LP.LJJJLZIJ(i, this.LLJJIJI)) != null) {
                            ListProtector.set(this.LLJJIJI, i, TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, view.getLeft(), view.getTop(), 0.0f, 0.0f, view.getWidth(), view.getHeight(), 0, 0, this.LLILZ, this.LLILZIL, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, view.getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16783769, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public final void LIZ(int i) {
        String str;
        List<TextStickerModel> arrayList;
        Map<Integer, C0MOH> map = C576300Miy.LIZ;
        int i2 = this.LLILZ;
        int i3 = this.LLILZIL;
        if (i != 0 && i != 3) {
            str = this.LLJJ;
        } else {
            str = this.LLJILLL;
        }
        String str2 = this.LLJJI;
        C0MOH c0moh = (C0MOH) ((LinkedHashMap) C576300Miy.LIZ).get(Integer.valueOf(i));
        if (c0moh == null || (arrayList = c0moh.LIZIZ(i2, i3, str, str2)) == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJJIJI = arrayList;
        C0RFT c0rft = this.LLJILJIL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<TextStickerModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getInteractStickerStruct());
        }
        c0rft.LIZLLL(arrayList2, this.LLJJIJI, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C576250Mit(View view, LifecycleOwner lifecycleOwner, ForwardMedia forwardMedia, int i, int i2, C1DRG c1drg, Map<String, ? extends List<? extends Function1<? super C0LAB, Unit>>> map, Function0<Unit> function0, List<Integer> list) {
        this.LL = view;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = forwardMedia;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = c1drg;
        this.LLIZ = map;
        this.LLIZLLLIL = function0;
        this.LLJ = list;
        this.LLJI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, C568190MQf.class, null);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.w4u);
        this.LLJILLL = view.getContext().getString(2131838702);
        this.LLJJ = view.getContext().getString(2131838701);
        C0MOG c0mog = LLJJIJIIJIL;
        long j = forwardMedia.createTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        c0mog.getClass();
        this.LLJJI = C0MOG.LIZJ(j);
        this.LLJJIII = (C576270Miv) C0MKZ.LIZIZ(forwardMedia, C576270Miv.class, new AwS552S0100000_8(this, 965));
        this.LLJJIJI = new ArrayList();
    }
}
