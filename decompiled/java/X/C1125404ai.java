package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.ab.MusicSearchSuggestedQueriesModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1125404ai {
    public static final List<String> LIZ() {
        Map<String, String> map;
        Collection<String> collectionValues;
        List<String> listLLIIII;
        MusicSearchSuggestedQueriesModel musicSearchSuggestedQueriesModel = (MusicSearchSuggestedQueriesModel) SettingsManager.LIZLLL().LJIIIIZZ("music_search_suggested_queries", MusicSearchSuggestedQueriesModel.class, null);
        return (musicSearchSuggestedQueriesModel == null || (map = musicSearchSuggestedQueriesModel.suggestedQueries) == null || (collectionValues = map.values()) == null || (listLLIIII = C13LP.LLIIII(collectionValues)) == null) ? C13BV.INSTANCE : listLLIIII;
    }
}
