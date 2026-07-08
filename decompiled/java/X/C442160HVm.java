package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumFragment;
import com.ss.android.ugc.aweme.poi.commonalbum.utils.CompressionTier;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0HVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442160HVm extends C14VB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C19EG c19egLIZIZ;
        String str;
        String str2;
        Object c098200Yq;
        int iIntValue;
        FragmentManager supportFragmentManager;
        C14VC c14vc = (C14VC) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            boolean zLIZIZ = C442100HVg.LIZIZ(c19egLIZIZ, new String[]{"android.permission.CAMERA"});
            if (C442100HVg.LIZIZ(c19egLIZIZ, (String[]) C442100HVg.LIZ.getValue())) {
                str = "total";
            } else if (C442100HVg.LIZ(c19egLIZIZ)) {
                str = "partial";
            } else {
                str = "none";
            }
            PageFinder pageFinderVia = PageFinder.via(c19egLIZIZ);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (zLIZIZ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C1189060h32.LJJ("is_camera_available", str2, linkedHashMap);
            C1189060h32.LJJ("album_available_type", str, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_album_authorize_request_result", linkedHashMap, c1185050gwZ);
            C442140HVk c442140HVk = LocalServiceAlbumFragment.LLJIJIL;
            AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(completionBlock, (CompletionBlock<InterfaceC1797640wsc>) 139);
            String trackParams = c14vc.getTrackParams();
            if (trackParams == null) {
                trackParams = "";
            }
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = (AlbumTrackParams) C1227904rF.LIZIZ(trackParams, AlbumTrackParams.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            List list = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            AlbumTrackParams albumTrackParams = (AlbumTrackParams) c098200Yq;
            if (albumTrackParams == null) {
                albumTrackParams = new AlbumTrackParams(null, null);
            }
            List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC442080HVe.TAKE_PHOTO, EnumC442080HVe.PHOTO);
            String compressConfig = c14vc.getCompressConfig();
            try {
                Type type = new TypeToken<List<? extends CompressionTier>>() { // from class: X.0HVn
                }.getType();
                C1227904rF.LIZ.getClass();
                List list2 = (List) C1227904rF.LIZJ(compressConfig, type);
                if (list2 == null) {
                    throw new IllegalArgumentException("JSON解析失败");
                }
                list = list2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            String cameraType = c14vc.getCameraType();
            if (cameraType == null) {
                cameraType = "back";
            }
            Number maxCount = c14vc.getMaxCount();
            if (maxCount != null) {
                iIntValue = maxCount.intValue();
            } else {
                iIntValue = 1;
            }
            C442110HVh c442110HVh = new C442110HVh(listLJIIJJI, 1, list, cameraType, iIntValue, albumTrackParams, System.currentTimeMillis());
            c442140HVk.getClass();
            LocalServiceAlbumFragment localServiceAlbumFragment = new LocalServiceAlbumFragment();
            localServiceAlbumFragment.LLIZLLLIL = awS582S0100000_3;
            localServiceAlbumFragment.LLJ = c442110HVh;
            int screenHeight = ScreenUtils.getScreenHeight(c19egLIZIZ);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = localServiceAlbumFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJJIJIL = null;
            tuxSheet.LLJJJ = null;
            c1390920mIc.LJIIIIZZ(1);
            c1390920mIc.LIZ.LLJJL = screenHeight;
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c19egLIZIZ);
            if (c19egLIZIZ2 != null && (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) != null) {
                c1390920mIc.LIZ.show(supportFragmentManager, "LocalServiceAlbumFragment");
            }
        }
    }
}
