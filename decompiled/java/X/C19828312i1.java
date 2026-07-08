package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.12i1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19828312i1 implements InterfaceC1456340o08<InterfaceC19830112iJ> {
    public static final C19828312i1 LLILLJJLI = new C19828312i1();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19830112iJ() { // from class: X.12gD
        public static final C19819812ge LIZ;
        public static final C19819812ge LIZIZ;
        public static final C19819812ge LIZJ;
        public static final C19819812ge LIZLLL;
        public static final C19824612hQ LJ;
        public static final C19824612hQ LJFF;
        public static final C19819812ge LJI;
        public static final C19819812ge LJII;
        public static final C19824612hQ LJIIIIZZ;
        public static final C19819812ge LJIIIZ;
        public static final C19819812ge LJIIJ;
        public static final C19819812ge LJIIJJI;
        public static final C19819812ge LJIIL;
        public static final C19819812ge LJIILIIL;
        public static final C19819812ge LJIILJJIL;
        public static final C19819812ge LJIILL;
        public static final C19819812ge LJIILLIIL;
        public static final C19819812ge LJIIZILJ;
        public static final C19819812ge LJIJ;
        public static final C19819812ge LJIJI;
        public static final C19824612hQ LJIJJ;
        public static final C19819812ge LJIJJLI;
        public static final C19819812ge LJIL;
        public static final C19819812ge LJJ;
        public static final C19824612hQ LJJI;
        public static final C19819812ge LJJIFFI;
        public static final C19824612hQ LJJII;
        public static final C19824612hQ LJJIII;
        public static final C19824612hQ LJJIIJ;
        public static final C19824612hQ LJJIIJZLJL;
        public static final C19819812ge LJJIIZ;
        public static final C19819812ge LJJIIZI;
        public static final C19819812ge LJJIJ;
        public static final C19819812ge LJJIJIIJI;
        public static final C19819812ge LJJIJIIJIL;
        public static final C19819812ge LJJIJIL;
        public static final C19819812ge LJJIJL;
        public static final C19819812ge LJJIJLIJ;
        public static final C19819812ge LJJIL;
        public static final C19819812ge LJJIZ;
        public static final C19819812ge LJJJ;
        public static final C19819812ge LJJJI;
        public static final C19819812ge LJJJIL;
        public static final C19819812ge LJJJJ;
        public static final C19819812ge LJJJJI;
        public static final C19819812ge LJJJJIZL;
        public static final C19819812ge LJJJJJ;
        public static final C19824612hQ LJJJJJL;
        public static final C19819812ge LJJJJL;
        public static final C19824612hQ LJJJJLI;

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZ(10000L, "measurement.ad_id_cache_time");
            LIZIZ = c19819912gfLIZJ.LIZ(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time");
            LIZJ = c19819912gfLIZJ.LIZ(100L, "measurement.max_bundles_per_iteration");
            LIZLLL = c19819912gfLIZJ.LIZ(86400000L, "measurement.config.cache_time");
            c19819912gfLIZJ.LIZLLL("measurement.log_tag", "FA");
            LJ = c19819912gfLIZJ.LIZLLL("measurement.config.url_authority", "app-measurement.com");
            LJFF = c19819912gfLIZJ.LIZLLL("measurement.config.url_scheme", "https");
            LJI = c19819912gfLIZJ.LIZ(1000L, "measurement.upload.debug_upload_interval");
            LJII = c19819912gfLIZJ.LIZ(3600000L, "measurement.session.engagement_interval");
            LJIIIIZZ = c19819912gfLIZJ.LIZLLL("measurement.rb.attribution.event_params", "value|currency");
            c19819912gfLIZJ.LIZ(0L, "measurement.id.rb.attribution.app_allowlist");
            LJIIIZ = c19819912gfLIZJ.LIZ(4L, "measurement.lifetimevalue.max_currency_tracked");
            LJIIJ = c19819912gfLIZJ.LIZ(1L, "measurement.dma_consent.max_daily_dcu_realtime_events");
            LJIIJJI = c19819912gfLIZJ.LIZ(100L, "measurement.upload.max_event_parameter_value_length");
            LJIIL = c19819912gfLIZJ.LIZ(100000L, "measurement.store.max_stored_events_per_app");
            LJIILIIL = c19819912gfLIZJ.LIZ(50L, "measurement.experiment.max_ids");
            LJIILJJIL = c19819912gfLIZJ.LIZ(200L, "measurement.audience.filter_result_max_count");
            LJIILL = c19819912gfLIZJ.LIZ(27L, "measurement.upload.max_item_scoped_custom_parameters");
            LJIILLIIL = c19819912gfLIZJ.LIZ(7L, "measurement.rb.attribution.client.min_ad_services_version");
            LJIIZILJ = c19819912gfLIZJ.LIZ(60000L, "measurement.alarm_manager.minimum_interval");
            LJIJ = c19819912gfLIZJ.LIZ(500L, "measurement.upload.minimum_delay");
            LJIJI = c19819912gfLIZJ.LIZ(86400000L, "measurement.monitoring.sample_period_millis");
            LJIJJ = c19819912gfLIZJ.LIZLLL("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
            LJIJJLI = c19819912gfLIZJ.LIZ(10000L, "measurement.upload.realtime_upload_interval");
            LJIL = c19819912gfLIZJ.LIZ(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
            c19819912gfLIZJ.LIZ(3600000L, "measurement.config.cache_time.service");
            LJJ = c19819912gfLIZJ.LIZ(Mp4ScreenVideoLoadTimeout.CONTROL, "measurement.service_client.idle_disconnect_millis");
            c19819912gfLIZJ.LIZLLL("measurement.log_tag.service", "FA-SVC");
            LJJI = c19819912gfLIZJ.LIZLLL("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa");
            LJJIFFI = c19819912gfLIZJ.LIZ(86400000L, "measurement.upload.stale_data_deletion_interval");
            LJJII = c19819912gfLIZJ.LIZLLL("measurement.rb.attribution.uri_authority", "google-analytics.com");
            LJJIII = c19819912gfLIZJ.LIZLLL("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
            LJJIIJ = c19819912gfLIZJ.LIZLLL("measurement.rb.attribution.query_parameters_to_remove", "");
            LJJIIJZLJL = c19819912gfLIZJ.LIZLLL("measurement.rb.attribution.uri_scheme", "https");
            LJJIIZ = c19819912gfLIZJ.LIZ(604800000L, "measurement.sdk.attribution.cache.ttl");
            LJJIIZI = c19819912gfLIZJ.LIZ(7200000L, "measurement.redaction.app_instance_id.ttl");
            LJJIJ = c19819912gfLIZJ.LIZ(43200000L, "measurement.upload.backoff_period");
            LJJIJIIJI = c19819912gfLIZJ.LIZ(15000L, "measurement.upload.initial_upload_delay_time");
            LJJIJIIJIL = c19819912gfLIZJ.LIZ(3600000L, "measurement.upload.interval");
            LJJIJIL = c19819912gfLIZJ.LIZ(65536L, "measurement.upload.max_bundle_size");
            LJJIJL = c19819912gfLIZJ.LIZ(100L, "measurement.upload.max_bundles");
            LJJIJLIJ = c19819912gfLIZJ.LIZ(500L, "measurement.upload.max_conversions_per_day");
            LJJIL = c19819912gfLIZJ.LIZ(1000L, "measurement.upload.max_error_events_per_day");
            LJJIZ = c19819912gfLIZJ.LIZ(1000L, "measurement.upload.max_events_per_bundle");
            LJJJ = c19819912gfLIZJ.LIZ(100000L, "measurement.upload.max_events_per_day");
            LJJJI = c19819912gfLIZJ.LIZ(50000L, "measurement.upload.max_public_events_per_day");
            LJJJIL = c19819912gfLIZJ.LIZ(2419200000L, "measurement.upload.max_queue_time");
            LJJJJ = c19819912gfLIZJ.LIZ(10L, "measurement.upload.max_realtime_events_per_day");
            LJJJJI = c19819912gfLIZJ.LIZ(65536L, "measurement.upload.max_batch_size");
            LJJJJIZL = c19819912gfLIZJ.LIZ(6L, "measurement.upload.retry_count");
            LJJJJJ = c19819912gfLIZJ.LIZ(1800000L, "measurement.upload.retry_time");
            LJJJJJL = c19819912gfLIZJ.LIZLLL("measurement.upload.url", "https://app-measurement.com/a");
            LJJJJL = c19819912gfLIZJ.LIZ(3600000L, "measurement.upload.window_interval");
            LJJJJLI = c19819912gfLIZJ.LIZLLL("measurement.rb.attribution.user_properties", "_npa,npa");
        }

        @Override // X.InterfaceC19830112iJ
        public final long LIZ() {
            return LIZIZ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LIZIZ() {
            return LIZJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LIZJ() {
            return LJIIIZ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LIZLLL() {
            return LIZLLL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJ() {
            return LJI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJFF() {
            return LJII.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJI() {
            return LJIIJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJII() {
            return LJJJJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIIIIZZ() {
            return LJIJI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIIIZ() {
            return LJJIFFI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIIJ() {
            return LJIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIIJJI() {
            return LJIIJJI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIIL() {
            return LJIILJJIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIILJJIL() {
            return LJIIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIILL() {
            return LJIILLIIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJIILLIIL() {
            return LJIIZILJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJJLIIL() {
            return LJIJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLI() {
            return LJJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIIJ() {
            return LJJIJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIJ() {
            return LJJIJLIJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIJILLIZJL() {
            return LJJIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIJJI() {
            return LJJIJIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIJJIZ() {
            return LJJIJL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIJL() {
            return LJJJI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIJLJLI() {
            return LJJJIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIIJLLLLLLLZ() {
            return LJJIZ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIIJ() {
            return LJJJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLIL() {
            return LJJJJJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLJ() {
            return LJJJJL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLJLI() {
            return LJJJJI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJJLL() {
            return LJJJJIZL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJJZ() {
            return LJIIIIZZ.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJJZZI() {
            return LJIJJ.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJJZZIII() {
            return LJ.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJL() {
            return LJFF.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJLI() {
            return LJJIII.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJLIIIL() {
            return LJJIIJ.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJLIIL() {
            return LJJI.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJLIL() {
            return LJJII.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJLILLLLZI() {
            return LJJJJLI.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJLJI() {
            return LJJIIJZLJL.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final String LJLJJI() {
            return LJJJJJL.LIZ();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJLJJL() {
            return LJIILL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJLJJLL() {
            return LJIILIIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJLJL() {
            return LJIJJLI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJLJLJ() {
            return LJJIIZ.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJLJLLL() {
            return LJJIJIIJI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJLL() {
            return LJJIJIIJIL.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long LJLLI() {
            return LJJIIZI.LIZ().longValue();
        }

        @Override // X.InterfaceC19830112iJ
        public final long zza() {
            return LIZ.LIZ().longValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12iJ] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19830112iJ get() {
        return this.LL.LL;
    }
}
