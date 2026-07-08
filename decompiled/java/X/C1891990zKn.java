package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891990zKn implements InterfaceC19670311xd {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public final Function1<SocialEmoji, Unit> LIZJ;
    public final C01GW LIZLLL;
    public TuxSheet LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    public final List<SocialEmoji> LIZIZ() {
        return (List) this.LJII.getValue();
    }

    @Override // X.InterfaceC19670311xd
    public final void LIZ(SocialEmoji socialEmoji) {
        if (!Intrinsics.LJFF(socialEmoji.emoji, "😍")) {
            List<SocialEmoji> listLIZIZ = LIZIZ();
            if (listLIZIZ.contains(socialEmoji)) {
                listLIZIZ.remove(socialEmoji);
            } else {
                C19719612Di.LJJIJ(listLIZIZ);
            }
            ListProtector.add(listLIZIZ, 1, socialEmoji);
        }
        Keva keva = (Keva) this.LJFF.getValue();
        C1891970zKl c1891970zKl = C1891970zKl.LIZ;
        List<SocialEmoji> listLIZIZ2 = LIZIZ();
        c1891970zKl.getClass();
        keva.storeString("EmojiStickerKey", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), listLIZIZ2));
        ((C453660Hqe) this.LJIIIIZZ.getValue()).LIZ(LIZIZ(), new C1892000zKo(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1891990zKn(ViewGroup viewGroup, Context context, Function1<? super SocialEmoji, Unit> function1) {
        ArrayList arrayList;
        int iIntValue;
        this.LIZ = viewGroup;
        this.LIZIZ = context;
        this.LIZJ = function1;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 794));
        this.LIZLLL = c01gwLIZIZ;
        this.LJFF = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(586));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS572S0100000_28(this, 795));
        this.LJI = c01gwLIZIZ2;
        this.LJII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 796));
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS572S0100000_28(this, 797));
        this.LJIIIIZZ = c01gwLIZIZ3;
        KevaBuilder.getInstance().setContext(context);
        viewGroup.addView((View) c01gwLIZIZ2.getValue(), new FrameLayout.LayoutParams(-1, -2, 80));
        ((C453660Hqe) c01gwLIZIZ3.getValue()).LIZ(LIZIZ(), new C1892020zKq(this));
        C786410Ut5.a9((TuxIconView) ((View) c01gwLIZIZ2.getValue()).findViewById(R.id.h09), new ACListenerS162S0100000_28(this, 113));
        ((RecyclerView) c01gwLIZIZ.getValue()).setLayoutManager(new GridLayoutManager(context, 5));
        C1891970zKl.LIZ.getClass();
        String str = "";
        try {
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("social_sticker_emoji_list", "");
            if (strLJI != null) {
                str = strLJI;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i = C1720306oT.LIZ;
        if (str.length() == 0) {
            arrayList = new ArrayList();
        } else {
            List list = (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, new TypeToken<List<? extends SocialEmoji>>() { // from class: X.0zKm
            }.getType());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(((SocialEmoji) obj).and);
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = Integer.MAX_VALUE;
                }
                if (iIntValue <= Build.VERSION.SDK_INT) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!LIZIZ().contains(obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList4.addAll(0, LIZIZ());
        ((RecyclerView) this.LIZLLL.getValue()).setAdapter(new C0H4L(arrayList4, new C1892010zKp(this), new C1892030zKr(this)));
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LIZIZ.getString(2131848589);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 798));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        c1390920mIc.LIZ.LLJJIII = (View) this.LIZLLL.getValue();
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(736));
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLIZIZ;
        tuxSheet2.LLJLILLLLZIIL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, this.LIZIZ);
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJI = numLIZJ;
        tuxSheet3.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(this, 12);
        this.LJ = tuxSheet3;
    }
}
