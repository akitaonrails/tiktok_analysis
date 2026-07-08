package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatlist.api.model.ChatInviteViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890340YwK extends C09AY implements Function0<IMChatListApi> {
    public C890340YwK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMChatListApi invoke() {
        ?? PluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IMChatListApi.class);
        return PluggableSpiForReal == 0 ? new IMChatListApi() { // from class: X.0YwL
            public final C0ZB7 LL;
            public final InterfaceC888840Ytu LLILLJJLI;
            public final InterfaceC882750Yk5 LLILLL;
            public final C0Z31 LLILZ;
            public final InterfaceC890430YwT LLILZIL;
            public final InterfaceC893700Z4e LLILZLL;
            public final InterfaceC884180YmO LLIZ;
            public final InterfaceC889950Yvh LLIZLLLIL;
            public final InterfaceC889880Yva LLJ;
            public final InterfaceC890150Yw1 LLJI;
            public final InterfaceC913280ZsE LLJIJIL;
            public final C0ZCZ LLJILJIL;
            public final InterfaceC1719806oO LLJILJILJ;
            public final InterfaceC890500Ywa LLJILLL;
            public final InterfaceC1412005fq LLJJ;
            public final InterfaceC882680Yjy LLJJI;
            public final InterfaceC754190TiD LLJJIII;

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LIZ() {
            }

            @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.service.IIMChatListApi
            public final void LIZJ(FragmentManager fragmentManager, EnumC894560Z7m enumC894560Z7m, String str) {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final ChatInviteViewModel LJ(C19EG c19eg) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJII() {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJIILJJIL() {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJIILL() {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final boolean LJIJI() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJIJJ() {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final boolean LJIL(String str, Lifecycle.State state) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJJ() {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJJII() {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final boolean LJJIII() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJJIIJZLJL() {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final View LJJIIZ(Context context) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJJIJ(LifecycleOwner lifecycleOwner, AwS546S0100000_2 awS546S0100000_2) {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJJIJIIJI(Context context, FragmentManager fragmentManager, C897280ZHy c897280ZHy) {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final boolean LJJIJIIJIL(Context context) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final void LJJIJL(FragmentManager fragmentManager, EnumC894560Z7m enumC894560Z7m) {
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final int LJJIJLIJ(C19719912Dl c19719912Dl) {
                return -1;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final boolean LJJJI() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final IMUserArchiveSettings LJJJJ() {
                return null;
            }

            {
                C0ZB7 c0zb7 = new C0ZB7() { // from class: X.0YwN
                    @Override // X.C0ZB7
                    public final void LIZ() {
                    }

                    @Override // X.C0ZB7
                    public final boolean LIZIZ() {
                        return false;
                    }

                    @Override // X.C0ZB7
                    public final void LIZJ() {
                    }

                    @Override // X.C0ZB7
                    public final void LIZLLL(boolean z) {
                    }

                    @Override // X.C0ZB7
                    public final void LJ(boolean z) {
                    }

                    @Override // X.C0ZB7
                    public final void LJFF(List<? extends InterfaceC1891350zJl> list) {
                    }

                    @Override // X.C0ZB7
                    public final void LJI() {
                    }

                    @Override // X.C0ZB7
                    public final void LJII(boolean z) {
                    }

                    @Override // X.C0ZB7
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.C0ZB7
                    public final void LJIIIZ(MotionEvent motionEvent) {
                    }

                    @Override // X.C0ZB7
                    public final void LJIIJ(int i, RecyclerView.LayoutManager layoutManager) {
                    }

                    @Override // X.C0ZB7
                    public final void LJIIJJI(String str, JSONObject jSONObject) {
                    }

                    @Override // X.C0ZB7
                    public final void LJIIL(int i, boolean z) {
                    }

                    @Override // X.C0ZB7
                    public final void LJIILIIL(C885880Yp8 c885880Yp8) {
                    }

                    @Override // X.C0ZB7
                    public final void LJIILJJIL() {
                    }
                };
                InterfaceC888840Ytu interfaceC888840Ytu = new InterfaceC888840Ytu() { // from class: X.0YwO
                    @Override // X.InterfaceC888840Ytu
                    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] LIZ() {
                        return new Class[0];
                    }
                };
                InterfaceC882750Yk5 interfaceC882750Yk5 = new InterfaceC882750Yk5() { // from class: X.0YwW
                    @Override // X.InterfaceC882750Yk5
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC882750Yk5
                    public final String LIZIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC882750Yk5
                    public final void LIZJ() {
                    }
                };
                InterfaceC890430YwT interfaceC890430YwT = new InterfaceC890430YwT() { // from class: X.0YwR
                    @Override // X.InterfaceC890430YwT
                    public final Long LIZ(String str, FilterTabType filterTabType, C876860Yaa c876860Yaa) {
                        return null;
                    }

                    @Override // X.InterfaceC890430YwT
                    public final boolean LIZIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC890430YwT
                    public final void LJFF() {
                    }

                    @Override // X.InterfaceC890430YwT
                    public final void onPause() {
                    }

                    @Override // X.InterfaceC890430YwT
                    public final void onResume() {
                    }
                };
                InterfaceC893700Z4e interfaceC893700Z4e = new InterfaceC893700Z4e() { // from class: X.0YwU
                    @Override // X.InterfaceC893700Z4e
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC893700Z4e
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC893700Z4e
                    public final C876610YaB LJIIIIZZ() {
                        return null;
                    }

                    @Override // X.InterfaceC893700Z4e
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC893700Z4e
                    public final void LJIIJ() {
                    }

                    @Override // X.InterfaceC893700Z4e
                    public final void LJIIJJI() {
                    }

                    @Override // X.InterfaceC893700Z4e
                    public final void LJIIL() {
                    }

                    @Override // X.InterfaceC893700Z4e
                    public final void LJIILIIL() {
                    }
                };
                InterfaceC884180YmO interfaceC884180YmO = new InterfaceC884180YmO() { // from class: X.0YbX
                    @Override // X.InterfaceC884180YmO
                    public final void LIZ(Activity activity, String str, List<String> list, InterfaceC879010Ye3 interfaceC879010Ye3, Function0<Unit> function0, Function0<Unit> function02, boolean z) {
                    }

                    @Override // X.InterfaceC884180YmO
                    public final void LIZIZ(Activity activity, String str, List<String> list, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02) {
                    }

                    @Override // X.InterfaceC884180YmO
                    public final void LIZJ(Context context) {
                    }
                };
                InterfaceC889950Yvh interfaceC889950Yvh = new InterfaceC889950Yvh() { // from class: X.0YwQ
                    @Override // X.InterfaceC889950Yvh
                    public final C2252321DDq LIZ() {
                        return C1BNE.LIZ(null);
                    }

                    @Override // X.InterfaceC889950Yvh
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC889950Yvh
                    public final C886330Ypr LIZJ() {
                        return null;
                    }

                    @Override // X.InterfaceC889950Yvh
                    public final void LIZLLL() {
                    }
                };
                InterfaceC889880Yva interfaceC889880Yva = new InterfaceC889880Yva() { // from class: X.0YwP
                    @Override // X.InterfaceC889880Yva
                    public final List<FilterTabType> LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC889880Yva
                    public final C2252321DDq LIZIZ() {
                        return C1BNE.LIZ(null);
                    }
                };
                InterfaceC890150Yw1 interfaceC890150Yw1 = new InterfaceC890150Yw1() { // from class: X.0Nwi
                    @Override // X.InterfaceC890150Yw1
                    public final String LIZ(SessionInfo sessionInfo, boolean z) {
                        return "";
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LIZIZ(String str, String str2) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LIZJ(String str, String str2, String str3, String str4, String str5) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LIZLLL(String str, boolean z, String str2, String str3, String str4, EnumC868530Y5j enumC868530Y5j, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LJ(int i, String str, String str2, String str3, String str4) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LJFF(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LJI(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LJII(List<String> list) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LJIIIIZZ(String str, String str2) {
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final String LJIIIZ(C0Y8T c0y8t) {
                        return null;
                    }

                    @Override // X.InterfaceC890150Yw1
                    public final void LJIIJ(String str, String str2) {
                    }
                };
                InterfaceC913280ZsE interfaceC913280ZsE = new InterfaceC913280ZsE() { // from class: X.0YwX
                    @Override // X.InterfaceC913280ZsE
                    public final void LIZ(long j) {
                    }
                };
                C0ZCZ c0zcz = new C0ZCZ() { // from class: X.0YwS
                    @Override // X.C0ZCZ
                    public final CharSequence LIZIZ(C869590Y9l c869590Y9l, String str) {
                        return "";
                    }

                    @Override // X.C0ZCZ
                    public final boolean LIZJ(C869590Y9l c869590Y9l) {
                        return false;
                    }
                };
                InterfaceC1719806oO interfaceC1719806oO = new InterfaceC1719806oO() { // from class: X.0YwY
                    @Override // X.InterfaceC1719806oO
                    public final void LIZ() {
                    }
                };
                InterfaceC890500Ywa interfaceC890500Ywa = new InterfaceC890500Ywa() { // from class: X.0YwZ
                    @Override // X.InterfaceC890500Ywa
                    public final boolean LIZ(Object obj, String str, String str2) {
                        return false;
                    }
                };
                InterfaceC1412005fq interfaceC1412005fq = new InterfaceC1412005fq() { // from class: X.05fp
                    @Override // X.InterfaceC1412005fq
                    public final boolean getHasShownBubble() {
                        return false;
                    }

                    @Override // X.InterfaceC1412005fq
                    public final void setHasShownBubble(boolean z) {
                    }

                    @Override // X.InterfaceC1412005fq
                    public final void showGuideBubbleForMessagingTool(Context context, View view, List<? extends EnumC1411605fm> list) {
                    }
                };
                this.LL = c0zb7;
                this.LLILLJJLI = interfaceC888840Ytu;
                this.LLILLL = interfaceC882750Yk5;
                this.LLILZ = null;
                this.LLILZIL = interfaceC890430YwT;
                this.LLILZLL = interfaceC893700Z4e;
                this.LLIZ = interfaceC884180YmO;
                this.LLIZLLLIL = interfaceC889950Yvh;
                this.LLJ = interfaceC889880Yva;
                this.LLJI = interfaceC890150Yw1;
                this.LLJIJIL = interfaceC913280ZsE;
                this.LLJILJIL = c0zcz;
                this.LLJILJILJ = interfaceC1719806oO;
                this.LLJILLL = interfaceC890500Ywa;
                this.LLJJ = interfaceC1412005fq;
                this.LLJJI = null;
                this.LLJJIII = null;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final C890510Ywb LJIJJLI() {
                return new C890510Ywb(false, false, false, 2047);
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi, com.ss.android.ugc.aweme.im.core.chatlist.api.service.IIMChatListApi
            public final InterfaceC890150Yw1 LIZIZ() {
                return this.LLJI;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC888840Ytu LIZLLL() {
                return this.LLILLJJLI;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final C0Y2X LJFF() {
                return new C0Y2X() { // from class: X.0YwV
                    @Override // X.C0Y2X
                    public final long LIZ(C0Y8T c0y8t) {
                        return -1L;
                    }
                };
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC754190TiD LJI() {
                return this.LLJJIII;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC913280ZsE LJIIIIZZ() {
                return this.LLJIJIL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC889950Yvh LJIIIZ() {
                return this.LLIZLLLIL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC1412005fq LJIIJ() {
                return this.LLJJ;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC893700Z4e LJIIJJI() {
                return this.LLILZLL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC890500Ywa LJIIL() {
                return this.LLJILLL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final C0ZB7 LJIILIIL() {
                return this.LL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final List<Object> LJIILLIIL() {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final C0Z31 LJIIZILJ() {
                return this.LLILZ;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC1719806oO LJJI() {
                return this.LLJILJILJ;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final C0ZCZ LJJIIJ() {
                return this.LLJILJIL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final List<Object> LJJIIZI() {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC882750Yk5 LJJIJIL() {
                return this.LLILLL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC882680Yjy LJJIL() {
                return this.LLJJI;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC889880Yva LJJIZ() {
                return this.LLJ;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC890430YwT LJJJ() {
                return this.LLILZIL;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final InterfaceC884180YmO LJJJIL() {
                return this.LLIZ;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final Object LJIJ(C0Y8T c0y8t, Activity activity, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
            public final AbstractC20660015ss<DialogFragment> LJJIFFI(Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
                return new AbstractC20660015ss<DialogFragment>() { // from class: X.0YwM
                    public final int LL = -1;

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        return null;
                    }

                    @Override // com.bytedance.poplayer.IPopupTask
                    public final /* bridge */ /* synthetic */ Object showPopup(C688120Qyw c688120Qyw) {
                        return null;
                    }

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return this.LL;
                    }
                };
            }
        } : PluggableSpiForReal;
    }
}
