package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0lAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347740lAy {
    public static final List<CommentImageModel> LIZLLL(List<? extends MediaModel> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends MediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1351950lHl.LJJ(it2.next()));
        }
        return arrayList;
    }

    public static final boolean LIZ(Aweme aweme, boolean z) {
        String region;
        if (aweme == null || (region = aweme.getRegion()) == null || region.length() == 0 || AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        C1350650lFf.LIZ.getClass();
        if (!C1350650lFf.LIZIZ()) {
            return false;
        }
        if (C13LQ.LJIILLIIL(aweme.getRegion(), (Object[]) C1380700m28.LIZIZ.getValue()) || z) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(int i, Fragment fragment) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(fragment.requireContext(), "comment_photo", true)) {
            Intent intentLJFF = ((IExternalAlbumService) ServiceManager.get().getService(IExternalAlbumService.class)).LJFF(fragment.requireContext(), i, i);
            C1701330uNH.LIZ(intentLJFF, fragment);
            C2204961BRm.LLJL(fragment, intentLJFF, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaN6fNZn8M3+SukU+KnFneCzN2+dpqHYs=", null));
            int i2 = C2208181Bbc.LJII;
            C2208191Bbd.LJIILL();
        }
    }

    public static final void LJ(Context context, Function0<Unit> function0, Function0<Unit> function02) {
        if (context == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getResources().getString(2131833299));
        c1397580mTM.LIZIZ(context.getResources().getString(2131833297));
        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(context, (Context) function0, (Function0<Unit>) 122));
        c1397580mTM.LIZLLL(new AwS591S0100000_12(function02, (Function0<Unit>) 1237));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static void LIZJ(AbstractC738140SxQ abstractC738140SxQ, int i, String str, InterfaceC1631620sYq interfaceC1631620sYq, int i2) {
        CreativeToolsPluginService creativeToolsPluginService;
        String description = str;
        InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            description = EnumC1347390lAP.COMMENT_PANEL_UPLOAD.getDescription();
        }
        if ((i2 & 8) != 0) {
            interfaceC1631620sYq2 = null;
        }
        Context context = abstractC738140SxQ.getContext();
        if (context != null && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("comment_photo_");
            sbLIZ.append(description);
            if (creativeToolsPluginService.LIZJ(context, C2188811AlT.LIZIZ(sbLIZ), true)) {
                Intent intentLJFF = ((IExternalAlbumService) ServiceManager.get().getService(IExternalAlbumService.class)).LJFF(context, i3, i3);
                intentLJFF.putExtra("shoot_way", "photo_comment");
                intentLJFF.putExtra("shoot_enter_method", description);
                C724240Sb0.LJIIIIZZ(abstractC738140SxQ, abstractC738140SxQ, intentLJFF, i3, null, interfaceC1631620sYq2);
                int i4 = C2208181Bbc.LJII;
                C2208191Bbd.LJIILL();
            }
        }
    }
}
