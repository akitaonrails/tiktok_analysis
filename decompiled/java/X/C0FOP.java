package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0FOP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOP extends AbstractC19563811gS<C0FOQ, C387450FHb> {
    public int LLL;

    @Override // X.AbstractC19563811gS
    public final void LLLLLLIL() {
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FOS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C387490FHf) obj).LJIIJJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 202));
        super.LLLLLLIL();
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0FOT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 203));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FOR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 204));
    }

    @Override // X.AbstractC19563811gS
    public final RecyclerView.ViewHolder LLLLLJLJLL(ViewGroup viewGroup) {
        int i;
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(requireSceneContext());
        if (C357780E0y.LIZ()) {
            i = R.layout.fso;
        } else {
            i = R.layout.fsn;
        }
        C0FOQ c0foq = new C0FOQ(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
        int i2 = this.LLL;
        if (i2 > 0 && (viewFindViewById = c0foq.LL.findViewById(R.id.l1o)) != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = i2;
        }
        return c0foq;
    }

    @Override // X.AbstractC19563811gS
    public final void LLLLLJIL(RecyclerView.ViewHolder viewHolder, C0FGT c0fgt) {
        ViewGroup.LayoutParams layoutParams;
        UrlModel iconUrl;
        List<String> url_list;
        String extra;
        UrlModel iconUrl2;
        List<String> url_list2;
        UrlModel iconUrl3;
        List<String> url_list3;
        C0FOQ c0foq = (C0FOQ) viewHolder;
        int i = this.LLL;
        if (i <= 0) {
            c0foq.getClass();
        } else {
            View viewFindViewById = c0foq.LL.findViewById(R.id.l1o);
            if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                layoutParams.height = i;
            }
        }
        if (((Boolean) C0FJ8.LIZ.getValue()).booleanValue()) {
            Effect effect = c0fgt.LIZ;
            if (effect != null && (extra = effect.getExtra()) != null) {
                JSONObject jSONObject = new JSONObject(extra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("translated_icon_");
                sbLIZ.append(C0CHQ.LIZ().getAppLanguage());
                String strOptString = jSONObject.optString(C2188811AlT.LIZIZ(sbLIZ));
                if (strOptString.length() == 0) {
                    Effect effect2 = c0fgt.LIZ;
                    if (effect2 != null && (iconUrl3 = effect2.getIconUrl()) != null && (url_list3 = iconUrl3.getUrl_list()) != null) {
                        SmartImageView smartImageView = c0foq.LLILLJJLI;
                        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(url_list3));
                        c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
                        c1331670kl3LJIIJ.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LJIIJ);
                    }
                } else {
                    Effect effect3 = c0fgt.LIZ;
                    if (effect3 != null && (iconUrl2 = effect3.getIconUrl()) != null && (url_list2 = iconUrl2.getUrl_list()) != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(url_list2, 10));
                        for (String str : url_list2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(a0.LJL(str, "/", str));
                            sbLIZ2.append('/');
                            sbLIZ2.append(strOptString);
                            arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        SmartImageView smartImageView2 = c0foq.LLILLJJLI;
                        C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(new C03IT(arrayList));
                        c1331670kl3LJIIJ2.LJJ = EnumC1338240kve.CENTER_CROP;
                        c1331670kl3LJIIJ2.LJJ(smartImageView2);
                        C786410Ut5.h3(c1331670kl3LJIIJ2);
                    }
                }
            }
        } else {
            Effect effect4 = c0fgt.LIZ;
            if (effect4 != null && (iconUrl = effect4.getIconUrl()) != null && (url_list = iconUrl.getUrl_list()) != null) {
                SmartImageView smartImageView3 = c0foq.LLILLJJLI;
                C1331670kl3 c1331670kl3LJIIJ3 = C1331660kl2.LJIIJ(new C03IT(url_list));
                c1331670kl3LJIIJ3.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJIIJ3.LJJ(smartImageView3);
                C786410Ut5.h3(c1331670kl3LJIIJ3);
            }
        }
        c0foq.LLILLL.setSelected(c0fgt.LIZJ);
    }

    @Override // X.AbstractC19563811gS, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroupOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (LLLLILI().LIZ.LJIIJJI > 0 && (layoutParams = viewGroupOnCreateView.getLayoutParams()) != null) {
            layoutParams.height = LLLLILI().LIZ.LJIIJJI - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        return viewGroupOnCreateView;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
