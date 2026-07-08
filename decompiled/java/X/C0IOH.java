package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.landscapefeeds.LiveLandNoMoreFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.VariantCardFragmentSetting;
import com.bytedance.android.livesdk.variant.ui.VariantCardFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0IOH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IOH extends C0IOI {
    public final C0IOG LLILZIL;
    public final C0IOJ LLILZLL;
    public final C830490Whz LLIZ;
    public LiveRoomFragment LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZIL.size();
    }

    public static String LJJIJL(EnterRoomConfig enterRoomConfig) {
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.fragmentItemVPId)) {
            return enterRoomConfig.mRoomsData.fragmentItemVPId;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enterRoomConfig.mRoomsData.roomId);
        sbLIZ.append("_");
        sbLIZ.append(enterRoomConfig.mLogData.requestId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        enterRoomConfig.mRoomsData.fragmentItemVPId = strLIZIZ;
        return strLIZIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        EnterRoomConfig enterRoomConfigEq;
        int iLJIIIIZZ;
        if (!(obj instanceof InterfaceC466370IQp) || (enterRoomConfigEq = ((InterfaceC466370IQp) obj).Eq()) == null || (iLJIIIIZZ = this.LLILZIL.LJIIIIZZ(enterRoomConfigEq)) < 0) {
            return -2;
        }
        return iLJIIIIZZ;
    }

    public final InterfaceC466370IQp LJJIJIL(int i) {
        return (InterfaceC466370IQp) this.LLIZ.get(LJJIJL(this.LLILZIL.LIZIZ(i)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0IOJ, java.lang.Object] */
    public C0IOH(FragmentManager fragmentManager, C0IOL c0iol) {
        super(fragmentManager);
        ?? r1 = new C0IKO() { // from class: X.0IOJ
            @Override // X.C0IKO
            public final void LIZIZ() {
                this.LL.notifyDataSetChanged();
            }
        };
        this.LLILZLL = r1;
        this.LLIZ = new C830490Whz();
        this.LLILZIL = c0iol;
        ((HashSet) c0iol.LL).add(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        C0IOG c0iog;
        InterfaceC466370IQp livePlayFragment;
        C0IOG c0iog2;
        Room roomLJIIJJI;
        Fragment fragment;
        if (this.LLILLL == null) {
            this.LLILLL = this.LLILLJJLI.LJIIJ();
        }
        String strLJJIJL = LJJIJL(this.LLILZIL.LIZIZ(i));
        int id = viewGroup.getId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(id);
        sbLIZ.append(":");
        sbLIZ.append(strLJJIJL);
        Fragment fragmentLJJJJZI = this.LLILLJJLI.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentLJJJJZI != null && !fragmentLJJJJZI.isRemoving()) {
            this.LLILLL.LJIIIIZZ(fragmentLJJJJZI);
            fragment = fragmentLJJJJZI;
        } else {
            if (VariantCardFragmentSetting.enable() && (c0iog2 = this.LLILZIL) != null && (roomLJIIJJI = c0iog2.LJIIJJI(i)) != null && roomLJIIJJI.isVariantCard()) {
                livePlayFragment = new VariantCardFragment();
            } else if (C464610IJv.LIZ() && (c0iog = this.LLILZIL) != null && i < c0iog.size() && this.LLILZIL.LJIIJJI(i) != null && this.LLILZIL.LJIIJJI(i).getId() == Long.MIN_VALUE) {
                livePlayFragment = new LiveLandNoMoreFragment();
            } else {
                livePlayFragment = new LivePlayFragment();
            }
            livePlayFragment.CJ(this.LLILZIL.LJIIJJI(i), this.LLILZIL.LIZIZ(i));
            Fragment fragment2 = livePlayFragment.getFragment();
            C19EH c19eh = this.LLILLL;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("android:switcher:");
            sbLIZ2.append(id3);
            sbLIZ2.append(":");
            sbLIZ2.append(strLJJIJL);
            c19eh.LIZJ(id2, fragment2, C2188811AlT.LIZIZ(sbLIZ2));
            fragment = fragment2;
        }
        if (fragment != this.LLILZ) {
            fragment.setMenuVisibility(false);
            fragment.setUserVisibleHint(false);
        }
        InterfaceC466370IQp interfaceC466370IQp = (InterfaceC466370IQp) fragment;
        interfaceC466370IQp.fG(i);
        this.LLIZ.put(LJJIJL(this.LLILZIL.LIZIZ(i)), interfaceC466370IQp);
        interfaceC466370IQp.eE(this.LLIZLLLIL);
        return interfaceC466370IQp;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof InterfaceC466370IQp) {
            InterfaceC466370IQp interfaceC466370IQp = (InterfaceC466370IQp) obj;
            interfaceC466370IQp.e0();
            this.LLILZIL.LJIIJ(interfaceC466370IQp.f8());
            this.LLIZ.remove(LJJIJL(interfaceC466370IQp.Eq()));
        }
        if (this.LLILLL == null) {
            this.LLILLL = this.LLILLJJLI.LJIIJ();
        }
        this.LLILLL.LJIIZILJ((Fragment) obj);
    }
}
