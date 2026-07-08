package com.bytedance.android.live.effect.music;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.effect.music.entity.AccompanimentsResponse;
import com.bytedance.android.live.effect.music.entity.AlbumsResponse;
import kotlin.Unit;
import tikcast.api.anchor.FavouritesSongsResponse;
import tikcast.api.anchor.PlaylistAddReq;
import tikcast.api.anchor.PlaylistAddResponse;
import tikcast.api.anchor.PlaylistDeleteResponse;
import tikcast.api.anchor.PlaylistSongsResponse;
import webcast.api.room.CollectionSongsResponse;
import webcast.api.room.MusicResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface AccompanimentApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/music/favourites/add/")
    Object addFavoriteSong(@InterfaceC1501050pAF("song_id") long j, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/music/playlist/add/")
    Object addPlaylistSong(@InterfaceC1485405rg PlaylistAddReq playlistAddReq, InterfaceC1364105Vn<? super C470590Icr<PlaylistAddResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/music/favourites/delete/")
    Object deleteFavoriteSong(@InterfaceC1501050pAF("song_id") long j, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/music/playlist/songs/")
    Object fetchPlaylist(@InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("count") long j2, InterfaceC1364105Vn<? super C470590Icr<PlaylistSongsResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/music/collection/songs/")
    C11NZ<C470590Icr<AccompanimentsResponse>> getAccompanimentsWithAlbumId(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("offset") long j2, @InterfaceC1501070pAH("count") long j3);

    @InterfaceC1501160pAQ("/webcast/room/music/")
    C11NZ<C470590Icr<AlbumsResponse>> getAlbums();

    @InterfaceC1501160pAQ("/webcast/room/music/")
    Object initData(@InterfaceC1501070pAH("last_playlist_song_id") long j, InterfaceC1364105Vn<? super C470590Icr<MusicResponse.Packs>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/music/favourites/songs/")
    Object loadMoreFavoriteSongs(@InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("count") long j2, InterfaceC1364105Vn<? super C470590Icr<FavouritesSongsResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/music/collection/songs/")
    Object loadMoreSongs(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("offset") long j2, @InterfaceC1501070pAH("count") long j3, InterfaceC1364105Vn<? super C470590Icr<CollectionSongsResponse.PageSongs>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/music/playlist/delete/")
    Object removePlaylistSong(@InterfaceC1501050pAF("song_id") long j, InterfaceC1364105Vn<? super C470590Icr<PlaylistDeleteResponse.ResponseData>> interfaceC1364105Vn);
}
