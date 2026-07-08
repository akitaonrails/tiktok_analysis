package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater;
import com.ss.android.ugc.aweme.services.publish.IPublishShareProvider;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC2173191A3h extends AbstractC855590XhN {
    public final IPublishShareProvider LLILLL;
    public final C01GW LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final List<Pair<EnumC1377930lxf, C21458918yR>> LLIZ;
    public TextView LLIZLLLIL;
    public View LLJ;
    public C0P0T LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public final HashMap<Integer, List<InterfaceC21459018yS>> LLJJI;
    public InterfaceC856360Xic LLJJIII;
    public boolean LLJJIJI;

    @Override // X.AbstractC855590XhN
    public final void LJFF() {
    }

    @Override // X.AbstractC855590XhN
    public final boolean LJI() {
        return false;
    }

    @Override // X.AbstractC855590XhN
    public final void LJIIIIZZ() {
    }

    @Override // X.AbstractC855590XhN
    public void LJIIIZ(boolean z) {
    }

    public abstract void LJIILIIL();

    public abstract void LJIILL();

    public abstract int getLayoutResId();

    @Override // X.AbstractC855590XhN
    public void setSaveLocalEnabled(boolean z) {
    }

    @Override // X.AbstractC855590XhN
    public final void LIZLLL() {
        if (this.LLILLL.canSparkSelected()) {
            for (Pair pair : (ArrayList) this.LLIZ) {
                if (Intrinsics.LJFF(((EnumC1377930lxf) pair.getFirst()).getKey(), EnumC1377930lxf.SPARK.getKey())) {
                    ((C21458918yR) pair.getSecond()).setCanChecked(true);
                }
            }
            if (C1238740iLA.LIZ().LIZ(0, "key_silent_share_save") == 20 && getRadioGroup().getCheckedRadioButtonId() == -1) {
                for (Pair pair2 : (ArrayList) this.LLIZ) {
                    if (Intrinsics.LJFF(((EnumC1377930lxf) pair2.getFirst()).getKey(), EnumC1377930lxf.SPARK.getKey())) {
                        ((CompoundButton) pair2.getSecond()).setChecked(true);
                        this.LLJILJIL = ((View) pair2.getSecond()).getId();
                    }
                }
            }
        } else {
            for (Pair pair3 : (ArrayList) this.LLIZ) {
                if (Intrinsics.LJFF(((EnumC1377930lxf) pair3.getFirst()).getKey(), EnumC1377930lxf.SPARK.getKey()) && getRadioGroup().getCheckedRadioButtonId() == ((View) pair3.getSecond()).getId()) {
                    this.LLJJ = true;
                    getRadioGroup().check(-1);
                }
            }
            for (Pair pair4 : (ArrayList) this.LLIZ) {
                if (Intrinsics.LJFF(((EnumC1377930lxf) pair4.getFirst()).getKey(), EnumC1377930lxf.SPARK.getKey())) {
                    ((C21458918yR) pair4.getSecond()).setCanChecked(false);
                }
            }
        }
        LJIILL();
        LJIIJJI();
    }

    @Override // X.AbstractC855590XhN
    public final String LJIIJ() {
        ArrayList arrayList = new ArrayList();
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C120300cz.LIZ(arrayList);
    }

    public final void LJIIJJI() {
        C1377920lxe c1377920lxe = EnumC1377930lxf.Companion;
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        c1377920lxe.getClass();
        if (!C1377920lxe.LIZ(activityLIZ).isEmpty()) {
            return;
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        RadioGroup radioGroup = getRadioGroup();
        int visibility2 = radioGroup.getVisibility();
        radioGroup.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, radioGroup);
    }

    public boolean LJIIL() {
        List<Pair<EnumC1377930lxf, C21458918yR>> list = this.LLIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<Pair<EnumC1377930lxf, C21458918yR>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(it2.next().getFirst().getKey(), EnumC1377930lxf.SPARK.getKey())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJIILLIIL() {
        if (!this.LLJJIJI && LJIIL()) {
            this.LLJJIJI = true;
            Object tag = getTag();
            Map map = tag instanceof Map ? (Map) tag : null;
            String strLJIJ = LJIJ(map != null ? map.get("enter_from") : null);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("panel_source_v2", "video_post_page_share");
            c2344009Gk.LJIIIIZZ("enter_from", strLJIJ);
            c2344009Gk.LJIIIIZZ("item_author_type", "1");
            c2344009Gk.LJIIIIZZ("series_category", CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LIZJ(C1357660lQy.LJIIJ(this.LLILLL.getPublishMobContentType(), map), "item_type");
            C20684815ws.LJIILLIIL("share_bottom_panel_show", c2344009Gk.LIZ);
        }
    }

    public final Pair<EnumC1377930lxf, C21458918yR> getCurrentChannelPair() {
        for (Pair<EnumC1377930lxf, C21458918yR> pair : (ArrayList) this.LLIZ) {
            if (pair.getSecond().getId() == getRadioGroup().getCheckedRadioButtonId()) {
                return pair;
            }
        }
        return null;
    }

    public final RadioGroup getRadioGroup() {
        return (RadioGroup) this.LLILZ.getValue();
    }

    @Override // X.AbstractC855590XhN
    public int getSaveUploadType() {
        EnumC1377930lxf first;
        Pair<EnumC1377930lxf, C21458918yR> currentChannelPair = getCurrentChannelPair();
        if (currentChannelPair == null || (first = currentChannelPair.getFirst()) == null) {
            return 0;
        }
        return first.getSaveType();
    }

    public final List<EnumC1377930lxf> getShareChannels() {
        if (C1388190mED.LIZ(getContext()) == null) {
            return C13BV.INSTANCE;
        }
        C1377920lxe c1377920lxe = EnumC1377930lxf.Companion;
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ != null) {
            c1377920lxe.getClass();
            return C1377920lxe.LIZ(activityLIZ);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List<Pair<EnumC1377930lxf, C21458918yR>> getButtonPairList() {
        return this.LLIZ;
    }

    public final boolean getHasCancelSynthetise() {
        return this.LLILZIL;
    }

    public final HashMap<Integer, List<InterfaceC21459018yS>> getInterceptors() {
        return this.LLJJI;
    }

    public final View getLayoutRoot() {
        return this.LLJ;
    }

    public final InterfaceC856360Xic getOnSharePanelClickListener() {
        return this.LLJJIII;
    }

    public final int getPrivacyType() {
        return this.LLILZLL;
    }

    public final IPublishShareProvider getPublishProvider() {
        return this.LLILLL;
    }

    public final TextView getSyncTitle() {
        return this.LLIZLLLIL;
    }

    public static final String LJIJ(Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return "";
        }
        return string;
    }

    @Override // X.AbstractC855590XhN
    public final void LIZIZ(C855500XhE c855500XhE) {
        this.LLJJIII = c855500XhE;
    }

    @Override // X.AbstractC855590XhN
    public void LIZJ(int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZLL = i;
        SharePrefCache.inst().getIsAwemePrivate().LJ(Boolean.valueOf(z));
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJJIJIL(getContext(), z);
        if (z) {
            if (getRadioGroup().getCheckedRadioButtonId() != -1) {
                getRadioGroup().check(-1);
            }
            Iterator it2 = ((ArrayList) this.LLIZ).iterator();
            while (it2.hasNext()) {
                ((C21458918yR) ((Pair) it2.next()).getSecond()).setCanChecked(false);
            }
        } else {
            int iLIZ = C1238740iLA.LIZ().LIZ(0, "key_silent_share_save");
            for (Pair pair : (ArrayList) this.LLIZ) {
                ((C21458918yR) pair.getSecond()).setCanChecked(true);
                if (((EnumC1377930lxf) pair.getFirst()).getSaveType() == iLIZ) {
                    ((CompoundButton) pair.getSecond()).setChecked(true);
                    this.LLJILJIL = ((View) pair.getSecond()).getId();
                }
            }
            if (this.LLILZLL != 0) {
                if (iLIZ == 20 && getRadioGroup().getCheckedRadioButtonId() != -1) {
                    getRadioGroup().check(-1);
                }
                for (Pair pair2 : (ArrayList) this.LLIZ) {
                    if (Intrinsics.LJFF(((EnumC1377930lxf) pair2.getFirst()).getKey(), EnumC1377930lxf.SPARK.getKey())) {
                        ((C21458918yR) pair2.getSecond()).setCanChecked(false);
                    }
                }
            }
        }
        LJIILL();
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        LJIIJJI();
    }

    public final void setHasCancelSynthetise(boolean z) {
        this.LLILZIL = z;
    }

    public final void setLayoutRoot(View view) {
        this.LLJ = view;
    }

    public final void setOnSharePanelClickListener(InterfaceC856360Xic interfaceC856360Xic) {
        this.LLJJIII = interfaceC856360Xic;
    }

    public final void setPrivacyType(int i) {
        this.LLILZLL = i;
    }

    @Override // X.AbstractC855590XhN
    public void setSyncIconSize(int i) {
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            ViewGroup.LayoutParams layoutParams = ((View) ((Pair) it2.next()).getSecond()).getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
        }
    }

    @Override // X.AbstractC855590XhN
    public void setSyncShareViewTextColor(int i) {
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // X.AbstractC855590XhN
    public void setSyncShareViewTextSize(float f) {
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    @Override // X.AbstractC855590XhN
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setSyncTitle(TextView textView) {
        this.LLIZLLLIL = textView;
    }

    public AbstractC2173191A3h(Context context, IPublishShareProvider iPublishShareProvider) {
        super(context);
        this.LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33((C2173201A3i) this, 4158));
        this.LLIZ = new ArrayList();
        this.LLJIJIL = 2;
        this.LLJILJIL = -1;
        this.LLJILJILJ = 44;
        this.LLJILLL = 30;
        this.LLJJI = new HashMap<>();
        this.LLILLL = iPublishShareProvider;
        this.LLJ = LJIJI(context, getLayoutResId(), this, true, "BaseSyncShareViewV2#getLayoutResId");
        LJIILIIL();
    }

    @Override // X.AbstractC855590XhN
    public void LIZ(int i, C855810Xhj c855810Xhj) {
        if (this.LLJJI.isEmpty()) {
            this.LLJJI.put(-2, new ArrayList());
        }
        HashMap<Integer, List<InterfaceC21459018yS>> map = this.LLJJI;
        Integer numValueOf = Integer.valueOf(i);
        List<InterfaceC21459018yS> arrayList = map.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(numValueOf, arrayList);
        }
        arrayList.add(c855810Xhj);
    }

    public final void LJIILJJIL(String str, boolean z) {
        Map map;
        String str2;
        Object tag = getTag();
        if ((tag instanceof Map) && (map = (Map) tag) != null) {
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            if (Intrinsics.LJFF(str, EnumC1377930lxf.SPARK.getKey())) {
                str = "tt_photo_standalone";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("creation_id", LJIJ(map.get("creation_id")));
            c2344009Gk.LJIIIIZZ("enter_from", LJIJ(map.get("enter_from")));
            c2344009Gk.LJIIIIZZ("content_type", LJIJ(map.get("content_type")));
            c2344009Gk.LJIIIIZZ("shoot_way", LJIJ(map.get("shoot_way")));
            c2344009Gk.LJIIIIZZ("share_to", str);
            C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
            if (z) {
                LJ();
            }
            LJIILL();
        }
    }

    public final void LJIIZILJ(View view, String str, String str2) {
        int i;
        if (C1238740iLA.LIZ().LIZ(0, "key_pop_up_window_share_count") >= 3 || (i = this.LLJIJIL) <= 0) {
            return;
        }
        this.LLJIJIL = i - 1;
        EnumC1377930lxf enumC1377930lxf = EnumC1377930lxf.SPARK;
        if (Intrinsics.LJFF(str2, enumC1377930lxf.getKey()) && !view.getGlobalVisibleRect(new Rect())) {
            return;
        }
        String string = getResources().getString(2131845897, str);
        if (Intrinsics.LJFF(str2, enumC1377930lxf.getKey())) {
            string = getResources().getString(2131839888, getResources().getString(2131839886));
        }
        C450720Hlu c450720Hlu = new C450720Hlu(getContext());
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c450720Hlu.LLILZ = string;
        c1391600mJi.LIZIZ = view;
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        this.LLJI = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
    }

    public final View LJIJI(Context context, int i, ViewGroup viewGroup, boolean z, String str) {
        InjectLayoutInflater injectLayoutInflaterInflater = this.LLILLL.inflater();
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (injectLayoutInflaterInflater != null && injectLayoutInflaterInflater.isInjectionEnabled() && activityLIZ != null) {
            injectLayoutInflaterInflater.setTag(str);
            return injectLayoutInflaterInflater.inflate(activityLIZ, i, viewGroup, z);
        }
        return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
    }
}
