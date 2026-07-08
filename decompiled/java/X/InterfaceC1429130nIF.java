package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1429130nIF {
    Pair<Integer, Integer> LIZ(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z);

    boolean LIZIZ();

    boolean LIZJ(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z);

    void LIZLLL();

    List<Integer> LJ(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z);

    void LJFF(Activity activity, CutsameDataItem cutsameDataItem, ShortVideoContext shortVideoContext);

    boolean LJI();

    boolean LJII();

    Intent LJIIIIZZ();

    void loadNLELib();

    void preloadTemplateLib(List<? extends Aweme> list);
}
