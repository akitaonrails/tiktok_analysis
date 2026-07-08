package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415940mwy {
    public final Context LIZ;
    public final ITemplateResourceService LIZIZ;
    public final InterfaceC1423480n98<Asset, CutsameDataItem> LIZJ;
    public final Function0<List<AutoCutMediaModel>> LIZLLL;
    public final Function0<CreativeInfo> LJ;
    public final Function0<String> LJFF;
    public final Function0<Boolean> LJI;
    public final Function0<C2268608ui> LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final String LJIIIZ;

    public C1415940mwy(Context context, ITemplateResourceService iTemplateResourceService, C1415150mvh c1415150mvh, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, String str) {
        this.LIZ = context;
        this.LIZIZ = iTemplateResourceService;
        this.LIZJ = c1415150mvh;
        this.LIZLLL = function0;
        this.LJ = function02;
        this.LJFF = function03;
        this.LJI = function04;
        this.LJII = function05;
        this.LJIIIIZZ = function06;
        this.LJIIIZ = str;
    }
}
