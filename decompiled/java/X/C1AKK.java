package X;

import Y.ARunnableS2S1000000_4;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.google.gson.n;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;
import webcast.api.room.NextLiveNoticeRegisterResponse;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: renamed from: X.1AKK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1AKK {
    void At(String str, String str2);

    void Cw(SparkContext sparkContext);

    boolean E5(String str, String str2, boolean z);

    boolean Eo();

    InterfaceC2175461ACa Hj();

    boolean Jv(String str);

    Map<String, Object> L7(long j);

    String LIZ();

    Object LIZJ(Object obj, String str);

    boolean LIZLLL(Context context, String str);

    boolean LJ();

    InterfaceC420801kM LJI(String str, String str2, long j, InterfaceC472850IgV interfaceC472850IgV);

    Boolean LJIIIIZZ();

    void LJIIIZ(String str);

    InterfaceC1087010eOR LJIIJ();

    void LJIIJJI(FragmentManager fragmentManager, C1106210etP c1106210etP, boolean z);

    void LJIIL();

    ICoinIncentiveService LJIILIIL();

    void LJIILJJIL(int i, Context context);

    void LJIILL(String str);

    void LJIILLIIL(C1295960jpS c1295960jpS, Boolean bool);

    void LJIIZILJ(boolean z);

    int LJIJ();

    String LJIJI();

    void LJIJJ(String str, Map<String, String> map);

    boolean LJIJJLI(Uri uri);

    void LJIL(JSONObject jSONObject);

    Spannable LJJI(Text text, String str);

    HashMap<String, String> LJJIFFI(EnterRoomConfig enterRoomConfig);

    IBillboardService LJJII();

    Fragment LJJIII(Map<String, Object> map);

    void LJJIIJ(List<String> list, C1322110kVd c1322110kVd, String str, String str2);

    InterfaceC662540Pym LJJIIJZLJL();

    void LJJIIZI(Context context, n nVar, n nVar2, String str, String str2, List list, ARunnableS2S1000000_4 aRunnableS2S1000000_4);

    boolean LJJIJ(Context context, Uri uri);

    String LJJIJIIJI();

    Fragment LJJIJIIJIL(Context context, C0K8N c0k8n, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str);

    void LJJIJIL(EnumC464390IIz enumC464390IIz, AbstractC464380IIy abstractC464380IIy);

    void LJJIJL(LifecycleOwner lifecycleOwner);

    void LJJIJLIJ();

    void LJJIL();

    EnterRoomConfig LJJIZ(Room room);

    void LJJJ(Context context, C1106210etP c1106210etP);

    void LJJJI(long j, long j2);

    void LJJJIL(List list);

    Pair<Boolean, Boolean> LJJJJ(Room room);

    void LJJJJI(String str);

    int LJJJJIZL();

    String LJJJJJ();

    void LJJJJL(InterfaceC469100IaS interfaceC469100IaS);

    void LJJJJLI(C1349210lDL c1349210lDL);

    InterfaceC488740JEq LJJJJLL(String str);

    String LJJJJZ(String str);

    C1AKI LJJJLIIL();

    void LJJJLL();

    void LJJJLZIJ(LifecycleOwner lifecycleOwner);

    Context LJJJZ();

    InterfaceC1253830ijV LJJL();

    String LJJLI(String str);

    void LJJLIIIIJ(Context context, n nVar);

    void LJJLIIIJ(Context context, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Map map);

    IMessageManager LJJLIIIJILLIZJL(long j, boolean z, Context context, boolean z2, boolean z3, EnumC19379710rr enumC19379710rr);

    void LJJLIIIJJIZ(InterfaceC480510Isr interfaceC480510Isr, String str);

    int LJJLIIIJL(Context context, DialogFragment dialogFragment, Bundle bundle, InterfaceC1149850g1n interfaceC1149850g1n);

    void LJJLIIIJLJLI(Activity activity, C1106210etP c1106210etP);

    void LJJLIIIJLLLLLLLZ();

    Object LJJLIIJ(String str);

    Boolean LJJLIL();

    void LJJLJ(Context context, String str);

    void LJJLJLI();

    InterfaceC1807610x8h LJJZZI(C1807570x8d c1807570x8d);

    void LJJZZIII();

    InterfaceC420801kM LJL(Long l, C19660911w7 c19660911w7);

    String LJLI();

    IPcsService LJLIIIL();

    String LJLIIL();

    InterfaceC468050IXb LJLIL();

    void LJLILLLLZI(Context context, Room room, C1106210etP c1106210etP, C760150Trp c760150Trp, C481110Itp c481110Itp);

    String LJLJI();

    CharSequence LJLJJI(User user);

    void LJLJJL();

    InterfaceC420801kM LJLJJLL(Map map, C19661011w8 c19661011w8);

    InterfaceC2175511ACf LJLJL(C1AF7 c1af7);

    C1AKO LJLJLJ(C1AKN c1akn, Bundle bundle);

    Drawable LJLJLLL(String str);

    void LJLL();

    long LJLLILLLL(boolean z);

    void LJLLJ(C19EG c19eg, AwS560S0100000_16 awS560S0100000_16);

    void LJLLL(C1913190zsz c1913190zsz);

    void LJLLLL(Room room, String str, String str2, String str3, String str4, String str5, Map map);

    void LJLLLLLL(long j, C1AA6 c1aa6);

    C1AKO LJLZ(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    void LJZ(int i, int i2, JSONObject jSONObject);

    void LJZI(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener);

    String LJZL();

    String LL();

    void LLD();

    String LLF(int i);

    InterfaceC420801kM LLFF(int i, long j, String str, C08MM c08mm);

    void LLFFF(EnumC1805570x5P enumC1805570x5P);

    void LLFII(String str, C1AKM c1akm);

    InterfaceC1791930wjP LLFZ();

    InterfaceC1728700v5Q LLI();

    Map<String, String> LLIFFJFJJ(Context context);

    InterfaceC420801kM LLII(int i, long j, int i2, C08MM c08mm);

    Fragment LLIIII(Context context, Bundle bundle);

    void LLIIIILZ(n nVar, String str, String str2);

    Fragment LLIIIL();

    InterfaceC468140IXk LLIIIZ();

    void LLIIJI(Context context, C759930TrT c759930TrT);

    void LLIIJLIL();

    int LLIIL();

    void LLIILII(String str);

    InterfaceC1766280w42 LLIILZL();

    C180W LLIIZ();

    InterfaceC420801kM LLIL(SubmitSurveyAnswerRequest submitSurveyAnswerRequest, C19660711w5 c19660711w5);

    void LLILII(C815960Vze c815960Vze);

    C11NZ LLILIL(int i);

    void LLILL(String str);

    void LLILLIZIL(String str);

    String LLILLJJLI();

    String LLILLL(Context context, EnterRoomConfig enterRoomConfig, long j);

    Fragment LLILZ(Context context, Bundle bundle);

    int LLILZIL(String str);

    InterfaceC480520Iss LLILZLL();

    void LLIZ(List list, Map map);

    void LLIZLLLIL(C1589100rSG c1589100rSG);

    boolean LLJI();

    boolean LLJILJIL();

    void LLJILJILJ(String str);

    boolean LLJILLL();

    InterfaceC480520Iss LLJJ(String str, boolean z);

    Bitmap LLJJI(float f, float f2, float f3, float f4);

    void LLJJIII(Activity activity, Boolean bool);

    void LLJJIJI(Activity activity, String str, Map<String, String> map, Boolean bool);

    boolean LLJJIJIIJIL();

    InterfaceC483310IxN Lb();

    InterfaceC469600IbG Mi();

    boolean Mn(String str);

    void Oa(C1106210etP c1106210etP);

    void P4();

    void T8(Map map);

    void W7(Context context);

    InterfaceC1210380hbQ Xo();

    void Xp();

    InterfaceC1210360hbO Ya();

    void Yg();

    void Zg();

    void Zq(String str);

    void addLiveDuration(long j);

    void advancePushStream();

    void againHandlerBundle(JSONObject jSONObject);

    boolean canRedirectRechargeV3();

    Observer<User> cb(LifecycleOwner lifecycleOwner, Function1<User, Unit> function1);

    @InterfaceC1294060jmO
    void cleanEffectCache();

    long cleanLiveUnimportantGecko(boolean z);

    C1AKR createLiveBroadcastEndFragment(Bundle bundle);

    InterfaceC337570DLf createLiveBroadcastEndSafetyToolsFragment(Bundle bundle);

    C1AKS createLiveBroadcastFragment(Context context, InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    C0UU9 createLiveCoverCameraFragment();

    C1AKO createObsBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    DialogFragment createRechargeDialogFragment(Context context, InterfaceC1806230x6T interfaceC1806230x6T, Bundle bundle, C1803830x2b c1803830x2b);

    InterfaceC782930UnT createStartLiveFragment(InterfaceC498680Jh4 interfaceC498680Jh4);

    C1AKO createVoiceChatBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    void cv();

    void dn(Observer<User> observer);

    boolean fi(String str);

    C0IEG fk(EnterRoomConfig enterRoomConfig);

    int getChargeSourceFromChargeFromHash(String str, int i);

    InterfaceC2262081DgM getCurrentUser();

    String getLiveCoreVersion();

    Map<String, InterfaceC1051760dTa> getLiveWalletJSB(WeakReference<Context> weakReference, IESJsBridge iESJsBridge);

    InterfaceC1051760dTa getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, IESJsBridge iESJsBridge);

    LynxUI<?> getLynxAudioLiveView(s sVar);

    C0UU6 getRequestControl();

    Map<String, String> getRoomInfo();

    String getRtcDeviceID();

    String getRtcVersion();

    boolean handleSchema(Context context, String str, Bundle bundle);

    boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map);

    void hasLopBubbleForLog(int i);

    void hasLopEnterBubbleForLog(int i);

    String i0();

    boolean isFirstRecharge();

    boolean isRechargeV3CacheAvailable(int i);

    void k7(LifecycleOwner lifecycleOwner);

    InterfaceC483370IxT ku();

    void notifyCloseAllLynxDialog();

    void notifyCustomSei();

    void notifyHostAppBoot();

    void onImageLoaded(boolean z, String str, JSONObject jSONObject);

    void onLocaleChanged(Locale locale);

    InterfaceC486670J6r ot();

    void pd(EnterRoomConfig enterRoomConfig);

    C1AKO pk(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    void preloadLiveStream(Context context, boolean z, boolean z2);

    void preloadVoiceChatLiveStream(Context context);

    void pv(Activity activity, String str, Map map, C1050980dSK c1050980dSK);

    C11NZ<NextLiveNoticeRegisterResponse> registerNextLiveNotice(boolean z, long j, boolean z2);

    void releaseVoiceChatLiveStream();

    void reportAbnormalLive(Context context);

    C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(long j, long j2);

    void sa();

    void setBroadcastActivity(Context context);

    boolean showFinishEncourage();

    InterfaceC20313114e1 startLiveManager();

    void stopVideoBroadcastService();

    Boolean tb(Context context, Room room);

    C0IKH tf(C19EG c19eg, C472280Ifa c472280Ifa, int i, EnumC469210Iad enumC469210Iad);

    void tt(FragmentManager fragmentManager);

    void u8(C1106210etP c1106210etP);

    void updateReferrerHostFromKeva(Context context);

    void updateRoomInfo(IMessageManager iMessageManager, long j, Context context);

    InterfaceC482440Ivy ut();

    void v3();

    Fragment wt(Map<String, Object> map);

    InterfaceC484900Izw x5(Context context);

    void xi(int i, Room room, String str, String str2, String str3, Map map);

    InterfaceC2175711ACz xo();

    void yp(String str, C0IFS c0ifs);

    InterfaceC468710IZp zr();
}
