package X;

import Y.AObserverS232S0100000_30;
import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.quickproduct.QuickProductSwitch;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.data.OecInitData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.14GY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14GY extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> implements InterfaceC1164530gPT {
    public final Context LLILLL;
    public Room LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 61));
    public boolean LLILZLL;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_broadcast_quick_product";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(10000);
    }

    public final C14GT LJJ() {
        return (C14GT) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<EnumC742820TBw> LJLI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC742820TBw.LIVE_ROOM_BOTTOM_CONTENT_HEIGHT);
        return arrayList;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        if (this.LLILZLL) {
            LJJ().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onPause() {
        if (this.LLILZLL) {
            LJJ().getClass();
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("live_quick_product_post_enable_changed", this);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
        if (this.LLILZLL) {
            C14GT c14gtLJJ = LJJ();
            c14gtLJJ.LIZ((C123100dR.LIZ(c14gtLJJ.LLJILJIL) && c14gtLJJ.LLJILJILJ) ? C14GV.ENTRANCE : C14GV.HIDE);
            if (C123100dR.LIZ(c14gtLJJ.LLJILJIL) && c14gtLJJ.LLJILJILJ) {
                C20236614Ge c20236614Ge = c14gtLJJ.LLILZ;
                if (c20236614Ge == null) {
                    c20236614Ge = null;
                }
                HandlerHook.viewPost(c20236614Ge, new ARunnableS130S0100000_30(c14gtLJJ, 51));
            }
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("live_quick_product_post_enable_changed", this);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStart() {
        if (this.LLILZLL) {
            LJJ().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStop() {
        if (this.LLILZLL) {
            LJJ().getClass();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return LJJ();
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_FREE_FRAME;
    }

    public C14GY(Context context) {
        this.LLILLL = context;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        LayerDrawable layerDrawableLJIILIIL;
        if (this.LLILZLL) {
            final C14GT c14gtLJJ = LJJ();
            if (C123100dR.LIZ(c14gtLJJ.LLJILJIL)) {
                View view = c14gtLJJ.LLILLL;
                ImageButton imageButton = null;
                if (view == null) {
                    view = null;
                }
                c14gtLJJ.LLILZLL = (C20236514Gd) view.findViewById(R.id.ddm);
                View view2 = c14gtLJJ.LLILLL;
                if (view2 == null) {
                    view2 = null;
                }
                c14gtLJJ.LLIZ = (RelativeLayout) view2.findViewById(R.id.ddo);
                View view3 = c14gtLJJ.LLILLL;
                if (view3 == null) {
                    view3 = null;
                }
                c14gtLJJ.LLILZ = (C20236614Ge) view3.findViewById(R.id.h7n);
                View view4 = c14gtLJJ.LLILLL;
                if (view4 == null) {
                    view4 = null;
                }
                C421410Gfj c421410Gfj = (C421410Gfj) view4.findViewById(R.id.eyt);
                c14gtLJJ.LLIZLLLIL = c421410Gfj;
                if (c421410Gfj == null) {
                    c421410Gfj = null;
                }
                c421410Gfj.setCountDownListener(new InterfaceC421430Gfl() { // from class: X.14GS
                    @Override // X.InterfaceC421430Gfl
                    public final void LIZ() {
                        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
                        C14GT c14gt = c14gtLJJ;
                        c14gt.getClass();
                        C14GR c14gr = C14GR.START_CAPTURE;
                        Room room = c14gt.LLJIJIL;
                        String strValueOf = String.valueOf(room != null ? Long.valueOf(room.getId()) : null);
                        Room room2 = c14gt.LLJIJIL;
                        C1744070vUD.LIZ(c14gr, strValueOf, String.valueOf((room2 == null || (interfaceC2262081DgMAuthor = room2.author()) == null) ? null : Long.valueOf(interfaceC2262081DgMAuthor.getId())));
                        c14gt.LIZ(C14GV.ENTRANCE);
                        IFrameSlot.SlotViewModel slotViewModel = c14gt.LLJJI;
                        if (slotViewModel == null) {
                            slotViewModel = null;
                        }
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel), (AbstractC23273099z) c14gt.LLJILLL.getValue(), null, new C14GP(c14gt, null), 2);
                    }
                });
                View view5 = c14gtLJJ.LLILLL;
                if (view5 == null) {
                    view5 = null;
                }
                ImageButton imageButton2 = (ImageButton) view5.findViewById(R.id.h7j);
                c14gtLJJ.LLILZIL = imageButton2;
                if (imageButton2 == null) {
                    imageButton2 = null;
                }
                Context context = c14gtLJJ.LL;
                if (context != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.drawable.c1v;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(C20642515q3.LIZJ(R.color.dg));
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                } else {
                    layerDrawableLJIILIIL = null;
                }
                imageButton2.setImageDrawable(layerDrawableLJIILIIL);
                ImageButton imageButton3 = c14gtLJJ.LLILZIL;
                if (imageButton3 != null) {
                    imageButton = imageButton3;
                }
                C786410Ut5.I7(new AbS698S0100000_17(c14gtLJJ, 19, 42), imageButton);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        Long lValueOf;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        if ((iMessage instanceof ECommerceMessage) && ((ECommerceMessage) iMessage).actionType == 8 && C1894507bT.LIZ()) {
            C14GR c14gr = C14GR.MESSAGE_RECEIVED;
            Room room = this.LLILZ;
            Long lValueOf2 = null;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Room room2 = this.LLILZ;
            if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null) {
                lValueOf2 = Long.valueOf(interfaceC2262081DgMAuthor.getId());
            }
            C1744070vUD.LIZ(c14gr, strValueOf, String.valueOf(lValueOf2));
            C14GT c14gtLJJ = LJJ();
            c14gtLJJ.LLJILJILJ = false;
            c14gtLJJ.LIZ(C14GV.HIDE);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LifecycleOwner lifecycleOwnerLJFF;
        IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        C14GT c14gtLJJ = LJJ();
        c14gtLJJ.LLJJI = slotViewModel;
        IFrameSlot.SlotViewModel slotViewModel2 = null;
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            lifecycleOwnerLJFF = C1388190mED.LIZIZ(c14gtLJJ.LL);
        } else {
            AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(c14gtLJJ.LL);
            if (abstractC1387200mCcLIZJ == null) {
                return;
            } else {
                lifecycleOwnerLJFF = abstractC1387200mCcLIZJ.LJFF();
            }
        }
        if (lifecycleOwnerLJFF != null) {
            IFrameSlot.SlotViewModel slotViewModel3 = c14gtLJJ.LLJJI;
            if (slotViewModel3 != null) {
                slotViewModel2 = slotViewModel3;
            }
            LiveData liveData = (LiveData) ((ConcurrentHashMap) slotViewModel2.LLILZ).get(EnumC742820TBw.LIVE_ROOM_BOTTOM_CONTENT_HEIGHT);
            if (liveData != null) {
                liveData.observe(lifecycleOwnerLJFF, new AObserverS232S0100000_30(c14gtLJJ, 7));
            }
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        QuickProductSwitch quickProductSwitch;
        Long lValueOf;
        C14GV c14gv;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        Type type;
        if (this.LLILZLL && TextUtils.equals(str, "live_quick_product_post_enable_changed")) {
            boolean z = false;
            Long lValueOf2 = null;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJ(QuickProductSwitch.class));
                } else {
                    type = new TypeToken<QuickProductSwitch>() { // from class: X.14Ga
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof QuickProductSwitch)) {
                    objFromJson = null;
                }
                quickProductSwitch = (QuickProductSwitch) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (quickProductSwitch == null) {
                quickProductSwitch = new QuickProductSwitch(1);
            }
            C14GR c14gr = C14GR.JSB_EVENT_RECEIVED;
            Room room = this.LLILZ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Room room2 = this.LLILZ;
            if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null) {
                lValueOf2 = Long.valueOf(interfaceC2262081DgMAuthor.getId());
            }
            C1744070vUD.LIZ(c14gr, strValueOf, String.valueOf(lValueOf2));
            C14GT c14gtLJJ = LJJ();
            if (quickProductSwitch.result == 1) {
                z = true;
            }
            c14gtLJJ.LLJILJILJ = z;
            if (z) {
                c14gv = C14GV.ENTRANCE;
            } else {
                c14gv = C14GV.HIDE;
            }
            c14gtLJJ.LIZ(c14gv);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        Room room2;
        String str;
        OecInitData oecInitData;
        String str2;
        boolean z;
        Long lValueOf;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        Type type;
        CommerceStruct commerceStruct;
        Object obj = map.get("param_room");
        Long lValueOf2 = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILZ = room;
        C14GT c14gtLJJ = LJJ();
        c14gtLJJ.getClass();
        Object obj2 = map.get("param_room");
        if (obj2 instanceof Room) {
            room2 = (Room) obj2;
        } else {
            room2 = null;
        }
        c14gtLJJ.LLJIJIL = room2;
        Object obj3 = map.get("param_is_hidden_ec_widget");
        if (!(obj3 instanceof Boolean)) {
            obj3 = null;
        }
        Room room3 = c14gtLJJ.LLJIJIL;
        if (room3 != null && (commerceStruct = room3.getCommerceStruct()) != null) {
            str = commerceStruct.oecInitDataString;
        } else {
            str = null;
        }
        boolean z2 = true;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(OecInitData.class));
            } else {
                type = new TypeToken<OecInitData>() { // from class: X.14GZ
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof OecInitData)) {
                objFromJson = null;
            }
            oecInitData = (OecInitData) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            oecInitData = null;
        }
        if (oecInitData == null) {
            str2 = null;
        } else {
            str2 = oecInitData.quickProductSchema;
        }
        c14gtLJJ.LLJILJIL = str2;
        if (oecInitData != null && oecInitData.quickProductEntrance) {
            z = true;
        } else {
            z = false;
        }
        c14gtLJJ.LLJILJILJ = z;
        if (C123100dR.LIZ(str2) && !Intrinsics.LJFF(obj3, Boolean.TRUE)) {
            C14GR c14gr = C14GR.ROOM_DATA_MET;
            Room room4 = c14gtLJJ.LLJIJIL;
            if (room4 != null) {
                lValueOf = Long.valueOf(room4.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Room room5 = c14gtLJJ.LLJIJIL;
            if (room5 != null && (interfaceC2262081DgMAuthor = room5.author()) != null) {
                lValueOf2 = Long.valueOf(interfaceC2262081DgMAuthor.getId());
            }
            C1744070vUD.LIZ(c14gr, strValueOf, String.valueOf(lValueOf2));
        } else {
            z2 = false;
        }
        this.LLILZLL = z2;
        interfaceC756140TlM.LIZ(z2);
    }
}
