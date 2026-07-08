package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.music.model.DspLinkType;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.PreSaveLogData;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633020OsG implements IMusicAddToDspCoreService {
    public static final C633020OsG LIZIZ = new C633020OsG();
    public final /* synthetic */ IMusicAddToDspCoreService LIZ = (IMusicAddToDspCoreService) ServiceManager.get().getService(IMusicAddToDspCoreService.class);

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LIZ(PreSaveLogData preSaveLogData) {
        this.LIZ.LIZ(preSaveLogData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final C610010NwF LIZIZ(EnumC631120OpC enumC631120OpC, String str) {
        return this.LIZ.LIZIZ(enumC631120OpC, str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LIZJ(Aweme aweme, EnumC631120OpC enumC631120OpC) {
        return this.LIZ.LIZJ(aweme, enumC631120OpC);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LIZLLL(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music) {
        return this.LIZ.LIZLLL(aweme, enumC631120OpC, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJ(EnumC631120OpC enumC631120OpC) {
        this.LIZ.LJ(enumC631120OpC);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJFF(Music music) {
        this.LIZ.LJFF(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJI(boolean z, LogData logData) {
        this.LIZ.LJI(z, logData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJII(C19EG c19eg, Fragment fragment, int i, int i2, Intent intent, Function0 function0) {
        return this.LIZ.LJII(c19eg, fragment, i, i2, intent, function0);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJIIIIZZ(AddSongContextData addSongContextData, List<? extends DspPlatform> list) {
        this.LIZ.LJIIIIZZ(addSongContextData, list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJIIIZ(Music music, EnumC631120OpC enumC631120OpC) {
        this.LIZ.LJIIIZ(music, enumC631120OpC);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJIIJ(EnumC631120OpC enumC631120OpC, String str, boolean z) {
        this.LIZ.LJIIJ(enumC631120OpC, str, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final AddSongEntranceViewModel LJIIJJI(Music music, AddSongContextData addSongContextData, LogData logData) {
        return this.LIZ.LJIIJJI(music, addSongContextData, logData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJIILIIL(boolean z) {
        return this.LIZ.LJIILIIL(z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final DspPlatform LJIILJJIL(Music music) {
        return this.LIZ.LJIILJJIL(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final String LJIILL(DspPlatform dspPlatform) {
        return this.LIZ.LJIILL(dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJIILLIIL(Music music, TT2DspAlbumInfo tT2DspAlbumInfo) {
        this.LIZ.LJIILLIIL(music, tT2DspAlbumInfo);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final InterfaceC629580Omi LJIIZILJ(boolean z) {
        return this.LIZ.LJIIZILJ(z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJIJ(Music music) {
        this.LIZ.LJIJ(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJIJI(String str, String str2, EnumC631120OpC enumC631120OpC) {
        this.LIZ.LJIJI(str, str2, enumC631120OpC);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final Pair<Boolean, String> LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJIJJLI(List<TT2DSPSongInfo> list) {
        return this.LIZ.LJIJJLI(list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final Fragment LJIL(Fragment fragment, AddSongContextData addSongContextData, DspSheetType dspSheetType, List<TT2DSPSongInfo> list) {
        return this.LIZ.LJIL(fragment, addSongContextData, dspSheetType, list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final DspPlatform LJJ(EnumC631120OpC enumC631120OpC) {
        return this.LIZ.LJJ(enumC631120OpC);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJIFFI(Music music, int i) {
        return this.LIZ.LJJIFFI(music, i);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final String LJJII(String str, String str2, String str3, Music music, TT2DspAlbumInfo tT2DspAlbumInfo) {
        return this.LIZ.LJJII(str, str2, str3, music, tT2DspAlbumInfo);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJIII(C19EG c19eg, Fragment fragment, AddSongContextData addSongContextData, DspPlatform dspPlatform) {
        return this.LIZ.LJJIII(c19eg, fragment, addSongContextData, dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJIIJZLJL(DspPlatform dspPlatform, Music music) {
        return this.LIZ.LJJIIJZLJL(dspPlatform, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJIIZ(EnumC631120OpC enumC631120OpC, C629600Omk c629600Omk) {
        this.LIZ.LJJIIZ(enumC631120OpC, c629600Omk);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJIIZI(Activity activity, Fragment fragment, AddSongContextData addSongContextData, DspPlatform dspPlatform, List<TT2DSPSongInfo> list, boolean z) {
        this.LIZ.LJJIIZI(activity, fragment, addSongContextData, dspPlatform, list, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJIJ(Aweme aweme, EnumC631120OpC enumC631120OpC) {
        return this.LIZ.LJJIJ(aweme, enumC631120OpC);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final String LJJIJIIJI(DspPlatform dspPlatform) {
        return this.LIZ.LJJIJIIJI(dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJIJIIJIL(Fragment fragment, AddSongContextData addSongContextData, List list, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, DspPlatform dspPlatform) {
        this.LIZ.LJJIJIIJIL(fragment, addSongContextData, list, mutableLiveData, mutableLiveData2, dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final InterfaceC346201Wa<DspPlatform> LJJIJIL() {
        return this.LIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final Integer LJJIJL(DspPlatform dspPlatform) {
        return this.LIZ.LJJIJL(dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJIJLIJ(C19EG c19eg, Fragment fragment, AddSongContextData addSongContextData, Music music, C610010NwF c610010NwF) {
        return this.LIZ.LJJIJLIJ(c19eg, fragment, addSongContextData, music, c610010NwF);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJIL(List<? extends DspPlatform> list) {
        return this.LIZ.LJJIL(list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final DspPlatform LJJIZ(TT2DspAlbumInfo tT2DspAlbumInfo) {
        return this.LIZ.LJJIZ(tT2DspAlbumInfo);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJJ(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music) {
        return this.LIZ.LJJJ(aweme, enumC631120OpC, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJI(AddSongContextData addSongContextData, DspLinkType dspLinkType, DspPlatform dspPlatform, Function0 function0, Function1 function1) {
        this.LIZ.LJJJI(addSongContextData, dspLinkType, dspPlatform, function0, function1);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJIL(EnumC631120OpC enumC631120OpC, String str) {
        this.LIZ.LJJJIL(enumC631120OpC, str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJJJ() {
        return this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJJJI(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music) {
        return this.LIZ.LJJJJI(aweme, enumC631120OpC, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJJIZL(AddSongContextData addSongContextData) {
        this.LIZ.LJJJJIZL(addSongContextData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final List<TT2DSPSongInfo> LJJJJJ(Music music) {
        return this.LIZ.LJJJJJ(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final Object LJJJJJL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LJJJJJL(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJJJL() {
        return this.LIZ.LJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final DspPlatform LJJJJLI(List<? extends DspPlatform> list) {
        return this.LIZ.LJJJJLI(list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJJLL(AddSongContextData addSongContextData) {
        this.LIZ.LJJJJLL(addSongContextData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJJJZ(EnumC631120OpC enumC631120OpC, String str) {
        return this.LIZ.LJJJJZ(enumC631120OpC, str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJJZI(Activity activity, Fragment fragment, AddSongContextData addSongContextData, DspPlatform dspPlatform, List<String> list, EnumC587920N4c enumC587920N4c, String str, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ.LJJJJZI(activity, fragment, addSongContextData, dspPlatform, list, enumC587920N4c, str, function0, function02);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJLIIL(EnumC631120OpC enumC631120OpC) {
        this.LIZ.LJJJLIIL(enumC631120OpC);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJLL(String str, String str2, DspPlatform dspPlatform, Boolean bool, boolean z, DspLinkType dspLinkType, AddSongContextData addSongContextData, String str3, String str4, List<String> list, boolean z2) {
        this.LIZ.LJJJLL(str, str2, dspPlatform, bool, z, dspLinkType, addSongContextData, str3, str4, list, z2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final InterfaceC346201Wa<List<TT2DSPPlatformInfo>> LJJJLZIJ() {
        return this.LIZ.LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJJZ(ReportData reportData) {
        this.LIZ.LJJJZ(reportData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJL(Music music) {
        return this.LIZ.LJJL(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final String LJJLI(DspPlatform dspPlatform) {
        return this.LIZ.LJJLI(dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final C629600Omk LJJLIIIIJ(EnumC631120OpC enumC631120OpC, EnumC631120OpC enumC631120OpC2, DspPlatform dspPlatform, Music music) {
        return this.LIZ.LJJLIIIIJ(enumC631120OpC, enumC631120OpC2, dspPlatform, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJLIIIJ() {
        return this.LIZ.LJJLIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJLIIIJILLIZJL(Music music, boolean z) {
        return this.LIZ.LJJLIIIJILLIZJL(music, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final List<DspPlatform> LJJLIIIJJI(Music music, TT2DspAlbumInfo tT2DspAlbumInfo, List<TT2DSPSongInfo> list, List<? extends DspPlatform> list2) {
        return this.LIZ.LJJLIIIJJI(music, tT2DspAlbumInfo, list, list2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJLIIIJJIZ(LogData logData) {
        this.LIZ.LJJLIIIJJIZ(logData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJLIIIJL(EnumC631120OpC enumC631120OpC, String str, C0P0X c0p0x) {
        this.LIZ.LJJLIIIJL(enumC631120OpC, str, c0p0x);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final DspPlatform LJJLIIIJLJLI(List<TT2DSPSongInfo> list) {
        return this.LIZ.LJJLIIIJLJLI(list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJLIIIJLLLLLLLZ(PreSaveLogData preSaveLogData) {
        this.LIZ.LJJLIIIJLLLLLLLZ(preSaveLogData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJLIIJ(Activity activity, Intent intent) {
        this.LIZ.LJJLIIJ(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final boolean LJJLIL(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music) {
        return this.LIZ.LJJLIL(aweme, enumC631120OpC, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJLJ(LogData logData) {
        this.LIZ.LJJLJ(logData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final DspPlatform LJJLJLI() {
        return this.LIZ.LJJLJLI();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJLL(EnumC631120OpC enumC631120OpC, String str, boolean z) {
        this.LIZ.LJJLL(enumC631120OpC, str, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJZ(Fragment fragment, AddSongContextData addSongContextData, DspSheetType dspSheetType, List<TT2DSPSongInfo> list, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ.LJJZ(fragment, addSongContextData, dspSheetType, list, function0, function02);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final void LJJZZI() {
        this.LIZ.LJJZZI();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final C610010NwF LJJZZIII(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music) {
        return this.LIZ.LJJZZIII(aweme, enumC631120OpC, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final DspPlatform getPlatformSelectedByUser() {
        return this.LIZ.getPlatformSelectedByUser();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return this.LIZ.provideXBridgetIDLMethodList();
    }
}
